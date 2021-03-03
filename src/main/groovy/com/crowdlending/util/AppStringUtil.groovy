package com.crowdlending.util

import org.apache.commons.io.IOUtils

import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream
import org.apache.commons.codec.binary.Base64



class AppStringUtil {
    static String encodeAndCompress(String srcTxt) {
        ByteArrayOutputStream rstBao = new ByteArrayOutputStream()
        GZIPOutputStream zos = new GZIPOutputStream(rstBao)
        zos.write(srcTxt.getBytes())
        IOUtils.closeQuietly(zos)
        byte[] bytes = rstBao.toByteArray()
        String encodedString = Base64.encodeBase64String(bytes)
        return encodedString
    }

    static String decodeAndDecompress(String srcTxt) {
        GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(Base64.decodeBase64(srcTxt)))
        BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "UTF-8"))
        String outStr = ""
        String line
        while ((line = bf.readLine()) != null) {
            outStr += line
        }
        return outStr

    }
}
