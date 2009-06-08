package fr.cls.atoll.motu.library.ftp;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.vfs.CacheStrategy;
import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystemConfigBuilder;
import org.apache.commons.vfs.FileSystemException;
import org.apache.commons.vfs.FileSystemOptions;
import org.apache.commons.vfs.Selectors;
import org.apache.commons.vfs.VFS;
import org.apache.commons.vfs.auth.StaticUserAuthenticator;
import org.apache.commons.vfs.impl.DefaultFileReplicator;
import org.apache.commons.vfs.impl.DefaultFileSystemConfigBuilder;
import org.apache.commons.vfs.impl.StandardFileSystemManager;
import org.apache.commons.vfs.provider.ftp.FtpClientFactory;
import org.apache.commons.vfs.provider.ftp.FtpFileSystemConfigBuilder;
import org.apache.commons.vfs.provider.sftp.SftpClientFactory;
import org.apache.commons.vfs.provider.sftp.SftpFileSystemConfigBuilder;
import org.apache.commons.vfs.provider.sftp.TrustEveryoneUserInfo;
import org.apache.log4j.Logger;

import com.jcraft.jsch.Session;

import fr.cls.atoll.motu.library.exception.MotuException;
import fr.cls.atoll.motu.library.exception.MotuExceptionBase;
import fr.cls.atoll.motu.library.intfce.Organizer;
import fr.cls.atoll.motu.library.intfce.TestIntfce;
import fr.cls.atoll.motu.library.intfce.TestIntfce.Client;
import fr.cls.atoll.motu.library.intfce.TestIntfce.Client2;
import fr.cls.atoll.motu.library.intfce.TestIntfce.Client3;
import fr.cls.commons.util.io.ConfigLoader;

public class TestFtp {
    /**
     * Logger for this class
     */
    private static final Logger LOG = Logger.getLogger(TestFtp.class);
    private static final Log _LOG = LogFactory.getLog(TestFtp.class);

    public class Client extends Thread {
        /**
         * Logger for this class
         */
        private final Logger LOG = Logger.getLogger(Client.class);

        public Client(String name) {
            this.name = name;
        }

        String name;

        public void run() {

            System.out.print("Start Client ");
            System.out.println(name);
            
            try {
                Organizer.getVFSSystemManager().copyFileToLocalFile("t", "t", "sftp", "CLS-EARITH.pc.cls.fr", "AsciiEnvisat.txt", "c:/tempVFS/AsciiEnvisat.txt");
                Organizer.removeVFSSystemManager();
            } catch (MotuExceptionBase e) {
                System.out.print("Exception in ");
                System.out.println(name);
                System.out.println(e.notifyException());
                e.printStackTrace();
            }

            System.out.print("End Client ");
            System.out.println(name);

        }
    }
    public class Client2 extends Thread {
        /**
         * Logger for this class
         */
        private final Logger LOG = Logger.getLogger(Client2.class);

        public Client2(String name) {
            this.name = name;
        }

        String name;

        public void run() {

            System.out.print("Start Client2 ");
            System.out.println(name);

            try {
                Organizer.getVFSSystemManager().copyFileToLocalFile("atoll", "atoll", "sftp", "catsat-data1.cls.fr/home/atoll", "/atoll-distrib/HOA_Catsat/Interface_ATOLL/nrt_med_infrared_sst_timestamp_FTP_20090516.xml", "c:/tempVFS/nrt_med_infrared_sst_timestamp_FTP_20090516.xml");
                Organizer.removeVFSSystemManager();
            } catch (MotuExceptionBase e) {
                System.out.print("Exception in ");
                System.out.println(name);
                System.out.println(e.notifyException());
                e.printStackTrace();
            }

            System.out.print("End Client2 ");
            System.out.println(name);

        }
    }
    public class Client3 extends Thread {
        /**
         * Logger for this class
         */
        private final Logger LOG = Logger.getLogger(Client3.class);

        public Client3(String name) {
            this.name = name;
        }

        String name;

        public void run() {

            System.out.print("Start Client3 ");
            System.out.println(name);

            try {
                Organizer.getVFSSystemManager().copyFileToLocalFile("anonymous", "dearith@cls.fr", "ftp", "ftp.cls.fr/pub/oceano/AVISO/", "NRT-SLA/maps/rt/j2/h/msla_rt_j2_err_21564.nc.gz", "c:/tempVFS/msla_rt_j2_err_21564.nc.gz");
                Organizer.removeVFSSystemManager();
            } catch (MotuExceptionBase e) {
                System.out.print("Exception in ");
                System.out.println(name);
                System.out.println(e.notifyException());
                e.printStackTrace();
            }

            System.out.print("End Client3 ");
            System.out.println(name);

        }
    }
    public class Client4 extends Thread {
        /**
         * Logger for this class
         */
        private final Logger LOG = Logger.getLogger(Client4.class);

        public Client4(String name) {
            this.name = name;
        }

        String name;

        public void run() {

            System.out.print("Start Client4 ");
            System.out.println(name);

            try {
                Organizer.getVFSSystemManager().copyFileToLocalFile("anonymous@ftp.unidata.ucar.edu", "", "ftp", "proxy.cls.fr", "/pub/README", "c:/tempVFS/README");
                Organizer.removeVFSSystemManager();
            } catch (MotuExceptionBase e) {
                System.out.print("Exception in ");
                System.out.println(name);
                System.out.println(e.notifyException());
                e.printStackTrace();
            }

            System.out.print("End Client4 ");
            System.out.println(name);

        }
    }
    
    public static void testVFSThread() {

        TestFtp testFtp = new TestFtp();
        //TestFtp.Client[] c = { testFtp.new Client("Client1"), testFtp.new Client("Client2"), };
        TestFtp.Client[] c = { testFtp.new Client("Client1A"),};
        for (int i = 0; i < c.length; i++) {
            c[i].start();
        }
        TestFtp.Client2[] c2 = { testFtp.new Client2("Client2A"),};
        for (int i = 0; i < c2.length; i++) {
            c2[i].start();
        }
        TestFtp.Client3[] c3 = { testFtp.new Client3("Client3A"), };
        for (int i = 0; i < c3.length; i++) {
            c3[i].start();
        }
        TestFtp.Client4[] c4 = { testFtp.new Client4("Client4A"), };
        for (int i = 0; i < c4.length; i++) {
            c4[i].start();
        }

    }

    /**
     * .
     * 
     * @param args
     */
    public static void main(String[] args) {

//        try {
//            URI uri = new URI("sftp://catsat-data1.cls.fr/home/atoll");
//            URI newURI = new URI(uri.getScheme(), "atoll:atoll", uri.getHost(), uri.getPort(), uri.getPath(), uri.getQuery(), uri.getFragment());
//            System.out.println(newURI.toString());
//            
//        } catch (URISyntaxException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
//        try {
//            Organizer.getVFSSystemManager();
//            //Organizer.closeVFSSystemManager();
//            Organizer.removeVFSSystemManager();
//        } catch (MotuException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
        
        
        //testFtp();
        // testSftp();
        //testVFS("t", "t", "sftp", "CLS-EARITH.pc.cls.fr", "AsciiEnvisat.txt");
        //testVFS("atoll", "atoll", "sftp", "catsat-data1.cls.fr/home/atoll", "/atoll-distrib/HOA_Catsat/Interface_ATOLL/nrt_med_infrared_sst_timestamp_FTP_20090516.xml");

        //testVFS("anonymous", "dearith@cls.fr", "ftp", "ftp.cls.fr/pub/oceano/AVISO/", "NRT-SLA/maps/rt/j2/h/msla_rt_j2_err_21564.nc.gz");
        //testVFS("anonymous@ftp.unidata.ucar.edu", "", "ftp", "proxy.cls.fr", "/pub/README");

        //testVFS("", "", "http", "catsat-data1.cls.fr:43080", "/thredds/catalog.xml");
                      
        
        //testVFS("anonymous@gridftp.bigred.iu.teragrid.org:2811", "dearith@cls.fr", "gsiftp", "proxy.cls.fr", "/pub/README");
        //testVFS("anonymous@dcgftp.usatlas.bnl.gov:2811/", "dearith@cls.fr", "gsiftp", "proxy.cls.fr", "pnfs/usatlas.bnl.gov/arelvalid/loadtest/data1188508850256");
        //gsiftp://gridftp.bigred.iu.teragrid.org:2811/
        //gsiftp://155.69.144.160:8080/home/shahand/globus-4.1.2.1/var/DWSSDF/repository/org_globus_examples_services_core_first.0.gar
        //gsiftp://dcgftp.usatlas.bnl.gov/pnfs/usatlas.bnl.gov/arelvalid/loadtest/data1188508850256
        //gsiftp://dcgftp.usatlas.bnl.gov:2811/pnfs/usatlas.bnl.gov/data/prod/pandadev/
        

        testVFSThread();
    }

    public static void testFtp() {

        // System.setProperty("http.proxyHost", "proxy.cls.fr"); // adresse IP
        // System.setProperty("http.proxyPort", "8080");
        // System.setProperty("socksProxyHost", "proxy.cls.fr");
        // System.setProperty("socksProxyPort", "1080");

        try {

            // String user = "anonymous";
            // String pass = "dearith@cls.fr";
            // String server = "ftp.cls.fr";
            //
            // FTPClient client = new FTPClient();
            // client.connect(server);
            // System.out.print(client.getReplyString());
            // int reply = client.getReplyCode();
            // if (!FTPReply.isPositiveCompletion(reply))
            // {
            // throw new IllegalArgumentException("cant connect: " + reply);
            // }
            // if (!client.login(user, pass))
            // {
            // throw new IllegalArgumentException("login failed");
            // }
            // client.enterLocalPassiveMode();
            // client.disconnect();

            FileSystemOptions opts = new FileSystemOptions();
            // FtpFileSystemConfigBuilder.getInstance().setUserDirIsRoot(opts, true);

            String server = "proxy.cls.fr";
            String user = "anonymous@ftp.unidata.ucar.edu";
            String pass = "";
            server = "ftp.cls.fr";
            user = "anonymous";
            pass = "dearith@cls.fr";
            
            StaticUserAuthenticator auth = new StaticUserAuthenticator(null, user, pass);
            DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
            FileObject fo = VFS.getManager().resolveFile("ftp://ftp.cls.fr/pub/oceano/AVISO/NRT-SLA/maps/rt/j2/h/msla_rt_j2_err_21564.nc.gz", opts);

            FTPClient ftpClient = FtpClientFactory.createConnection(server, 21, user.toCharArray(), pass.toCharArray(), ".", opts);
        } catch (FileSystemException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // } catch (SocketException e) {
            // // TODO Auto-generated catch block
            // e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void testSftp() {

        try {

            // String user = "anonymous";
            // String pass = "dearith@cls.fr";
            // String server = "ftp.cls.fr";
            //
            // FTPClient client = new FTPClient();
            // client.connect(server);
            // System.out.print(client.getReplyString());
            // int reply = client.getReplyCode();
            // if (!FTPReply.isPositiveCompletion(reply))
            // {
            // throw new IllegalArgumentException("cant connect: " + reply);
            // }
            // if (!client.login(user, pass))
            // {
            // throw new IllegalArgumentException("login failed");
            // }
            // client.enterLocalPassiveMode();
            // client.disconnect();

            FileSystemOptions opts = new FileSystemOptions();
            SftpFileSystemConfigBuilder.getInstance().setUserDirIsRoot(opts, true);
            SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");
            // SftpFileSystemConfigBuilder.getInstance().setProxyHost(opts, "proxy.cls.fr");
            // SftpFileSystemConfigBuilder.getInstance().setProxyPort(opts, 8080);
            // SftpFileSystemConfigBuilder.getInstance().setProxyType(opts,
            // SftpFileSystemConfigBuilder.PROXY_SOCKS5 );
            // //SftpFileSystemConfigBuilder.getInstance().setProxyType(opts,
            // SftpFileSystemConfigBuilder.PROXY_HTTP );
            FileObject fo = VFS.getManager().resolveFile("sftp://t:t@CLS-EARITH.pc.cls.fr/AsciiEnvisat.txt", opts);
            String server = "CLS-EARITH.pc.cls.fr";
            String user = "t";
            String pass = "t";

            server = "aviso-motu.cls.fr";
            user = "mapserv";
            pass = "mapserv";
            Session sftpClient = SftpClientFactory.createConnection(server, 22, user.toCharArray(), pass.toCharArray(), opts);
        } catch (FileSystemException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            // } catch (SocketException e) {
            // // TODO Auto-generated catch block
            // e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void testVFS(String user, String pwd, String scheme, String host, String file) {
        StandardFileSystemManager fsManager = null;

        try {
            fsManager = new StandardFileSystemManager();
            fsManager.setLogger(_LOG);

            StaticUserAuthenticator auth = new StaticUserAuthenticator(null, user, pwd);

            fsManager.setConfiguration(ConfigLoader.getInstance().get(Organizer.getVFSProviderConfig()));
            fsManager.setCacheStrategy(CacheStrategy.ON_CALL);
            // fsManager.addProvider("moi", new DefaultLocalFileProvider());
            fsManager.init();

            FileSystemOptions opts = new FileSystemOptions();
            FileSystemConfigBuilder fscb = fsManager.getFileSystemConfigBuilder(scheme);
            DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);

            System.out.println(fsManager.getProviderCapabilities(scheme));
            
            if (fscb instanceof FtpFileSystemConfigBuilder) {
                FtpFileSystemConfigBuilder ftpFscb = (FtpFileSystemConfigBuilder) fscb;
                //ftpFscb.setUserDirIsRoot(opts, true);

            }
            if (fscb instanceof SftpFileSystemConfigBuilder) {
                SftpFileSystemConfigBuilder sftpFscb = (SftpFileSystemConfigBuilder) fscb;
                //sftpFscb.setUserDirIsRoot(opts, true);
                
//                TrustEveryoneUserInfo trustEveryoneUserInfo = new TrustEveryoneUserInfo();
//                trustEveryoneUserInfo.promptYesNo("eddfsdfs");
//                sftpFscb.setUserInfo(opts, new TrustEveryoneUserInfo());
                sftpFscb.setTimeout(opts, 5000);
                // SftpFileSystemConfigBuilder.getInstance().setUserDirIsRoot(opts, true);
                // SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");

            }
            //FileObject fo = fsManager.resolveFile("ftp://ftp.cls.fr/pub/oceano/AVISO/NRT-SLA/maps/rt/j2/h/msla_rt_j2_err_21564.nc.gz", opts);

            //String uri = String.format("%s://%s/%s", scheme, host, file);
            //String uri = String.format("%s://%s/", scheme, host);
            //FileObject originBase = fsManager.resolveFile(uri, opts);
            //fsManager.setBaseFile(originBase);

            File tempDir = new File("c:/tempVFS");
            // File tempFile = File.createTempFile("AsciiEnvisat", ".txt", tempDir);
            File hostFile = new File(file);
            String fileName = hostFile.getName();
            File newFile = new File(tempDir, fileName);
            newFile.createNewFile();

            DefaultFileReplicator dfr = new DefaultFileReplicator(tempDir);
            fsManager.setTemporaryFileStore(dfr);
//            System.out.println(fsManager.getBaseFile());
//            System.out.println(dfr);
//            System.out.println(fsManager.getTemporaryFileStore());

            // FileObject ff = fsManager.resolveFile("sftp://t:t@CLS-EARITH.pc.cls.fr/AsciiEnvisat.txt",
            // opts);
            String uri = String.format("%s://%s/%s", scheme, host, file);
            //FileObject ff2 = fsManager.resolveFile("sftp://atoll:atoll@catsat-data1.cls.fr/home/atoll/atoll-distrib/HOA_Catsat/Interface_ATOLL/nrt_med_infrared_sst_timestamp_FTP_20090516.xml");
            FileObject ff = fsManager.resolveFile(uri, opts);
            FileObject dest = fsManager.toFileObject(newFile);
            //dest.copyFrom(ff2, Selectors.SELECT_ALL);
            dest.copyFrom(ff, Selectors.SELECT_ALL);
//            
//            URL url = ff.getURL();
//            
//            url.openConnection();
//            URLConnection conn = url.openConnection();
//            InputStream in = conn.getInputStream();
//            in.close();
            
          //InputStream in = ff.getContent().getInputStream();
            
        } catch (FileSystemException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MotuException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //fsManager.close();
            //fsManager.freeUnusedResources();
        }

    }
}