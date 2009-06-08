package fr.cls.atoll.motu.processor.wps;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpException;
import org.apache.log4j.Logger;
import org.deegree.commons.utils.HttpUtils;

/**
 * <br>
 * <br>
 * Copyright : Copyright (c) 2009. <br>
 * <br>
 * Soci�t� : CLS (Collecte Localisation Satellites)
 * 
 * @author $Author: dearith $
 * @version $Revision: 1.6 $ - $Date: 2009-05-05 10:28:48 $
 */
public class TestWPS {
    /**
     * Logger for this class
     */
    private static final Logger LOG = Logger.getLogger(TestWPS.class);
    public class GetObjectId
    {
      public GetObjectId(){}
    }
    /**
     * .
     * 
     * @param args
     */
    public static void main(String[] args) {
        
//        for (ErrorType c: ErrorType.values()) {
//            if (c.toString().equalsIgnoreCase("system")) {
//                System.out.println(c.toString());
//            }
//        }


        //testBodyPost();
        //testUTF8EncodeDecode();
        
//        TestWPS test = new TestWPS();
//        
//        TestWPS.GetObjectId id = test.new  GetObjectId();
//        System.out.println(id.hashCode());
//        TestWPS.GetObjectId id2 = test.new  GetObjectId();
//        System.out.println(id2.hashCode());
//        
//        TestWPS.GetObjectId id3 = id;
//        System.out.println(id3.hashCode());
//        
//        String abc = new String("Australia");
//        System.out.println("Hash code for String object: " + abc.hashCode());
//        String abc2 = new String("Australia");
//        System.out.println("Hash code for String object: " + abc2.hashCode());
//
//        
        
//        try {
//            // Generate a DES key
//            KeyGenerator keyGen = KeyGenerator.getInstance("DES");
//            SecretKey key = keyGen.generateKey();
//            System.out.println(key.hashCode());
//            // Get the bytes of the key
//            byte[] keyBytes = key.getEncoded();
//            int numBytes = keyBytes.length;
//            String string = new String(keyBytes);
//            System.out.println(string);
//            
//
//            // Generate a Blowfish key
//            keyGen = KeyGenerator.getInstance("Blowfish");
//            key = keyGen.generateKey();
//            System.out.println(key.hashCode());
//        
//            // Generate a triple DES key
//            keyGen = KeyGenerator.getInstance("DESede");
//            key = keyGen.generateKey();
//            System.out.println(key.hashCode());
//        } catch (java.security.NoSuchAlgorithmException e) {
//        }

    }

    public static void testBodyPost() {

        String href = "http://localhost:8080/atoll-motuservlet/services";
        String postBodyString = "<wps:Execute  xmlns:wps=\"http://www.opengis.net/wps/1.0.0\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:ows=\"http://www.opengis.net/ows/1.1\" service=\"WPS\" version=\"1.0.0\" xsi:schemaLocation=\"http://www.opengis.net/wps/1.0.0 http://schemas.opengis.net/wps/1.0.0/wpsExecute_request.xsd\">                        <ows:Identifier>TestAdd</ows:Identifier>                        <wps:DataInputs>                            <wps:Input>                             <ows:Identifier>A</ows:Identifier>                              <wps:Data>                                  <wps:ComplexData>10</wps:ComplexData>                               </wps:Data>                         </wps:Input>                            <wps:Input>                             <ows:Identifier>B</ows:Identifier>                              <wps:Data>                                  <wps:ComplexData>8</wps:ComplexData>                                </wps:Data>                         </wps:Input>                        </wps:DataInputs>                   <wps:ResponseForm>                          <wps:RawDataOutput mimeType=\"text/plain\">                             <ows:Identifier>C</ows:Identifier>                          </wps:RawDataOutput>                        </wps:ResponseForm>           </wps:Execute>              </wps:Body>";
        LOG.debug("Using post body '" + postBodyString + "'");
        // TODO what about the encoding here?
        InputStream is = new ByteArrayInputStream(postBodyString.getBytes());
        Map<String, String> headers = new HashMap<String, String>();
        try {
            is = HttpUtils.post(HttpUtils.STREAM, href, is, headers);
            byte b[] = new byte[1024];

            int bytesRead = 0;

            while ((bytesRead = is.read(b)) != -1) {
                String nextLine = new String(b, 0, bytesRead);
                System.out.println(nextLine);
            }

        } catch (HttpException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void testUTF8EncodeDecode() {
        int i = 270;
        String str = Integer.toString(i);
        
        CharBuffer result = byteConvert(str.getBytes(), "UTF-8");
        System.out.println(result);
        //result = byteConvert(str.getBytes(), "base64");
        //System.out.println(result);

    }

    public static void print(ByteBuffer bb) {
        while (bb.hasRemaining())
            System.out.print(bb.get() + " ");
        System.out.println();
        bb.rewind();
    }
    public static CharBuffer byteConvert(byte[] value, String charset) {
        ByteBuffer bb = ByteBuffer.wrap(value);
        CharBuffer charBuffer = null;
        try {
            Charset csets = Charset.forName(charset);
            charBuffer =  csets.decode(bb);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String str = charBuffer.toString();
        System.out.println("XXXXXXXX");
        System.out.println(str);

        return charBuffer;
    }

}