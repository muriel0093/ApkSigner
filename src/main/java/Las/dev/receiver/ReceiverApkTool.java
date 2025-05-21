package Las.dev.receiver;

import java.io.IOException;

public class ReceiverApkTool {
    public void alignApk() {
        System.out.println("Alinhando APK...");

        String zipalignPath = "C:\\Users\\erika\\AppData\\Local\\Android\\Sdk\\build-tools\\36.0.0\\zipalign.exe";
        String apkPath = "E:\\ApkSigner\\ApkSigner\\Garcom_3.5.9.apk";
        String outputPath = "E:\\ApkSigner\\ApkSigner\\apk-aligned.apk";

        ProcessBuilder builder = new ProcessBuilder(
                zipalignPath, "-v", "4", apkPath, outputPath
        );

        builder.inheritIO();
        try {
            int result = builder.start().waitFor();
            if (result == 0) {
                System.out.println("APK alinhado com sucesso.");
            } else {
                System.out.println("Erro ao alinhar APK. Código de saída: " + result);
            }
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
