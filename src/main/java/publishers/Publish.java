package publishers;

import jakarta.xml.ws.Endpoint;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Publish {

    private Properties props = new Properties();

    public Publish() {
        try (FileInputStream fis = new FileInputStream(
                System.getProperty("user.home") + "/volandouy/config.properties")) {
            props.load(fis);
        } catch (IOException e) {
            // Fallback or just log
            System.err.println(
                    "No se pudo cargar config.properties, usando defaults o fallando si es critico: " + e.getMessage());
        }
    }

    public void publicar() {
        System.out.println(">>> Publicando Web Services...");
        String url = props.getProperty("sistema.url");
        Endpoint.publish(url, new ControladorSistemaPublish());
        System.out.println(">>> WS PUBLICADOS - " + url);
    }

    public static void main(String[] args) {
        new Publish().publicar();
    }
}