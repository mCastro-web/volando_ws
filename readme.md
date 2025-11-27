# VolandoUy - Web Services

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.x-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![JAX-WS](https://img.shields.io/badge/JAX--WS-4.0.0-007396?style=for-the-badge)
![JAXB](https://img.shields.io/badge/JAXB-4.0.4-4B8BBE?style=for-the-badge)
![SOAP](https://img.shields.io/badge/SOAP-Web%20Services-5C2D91?style=for-the-badge)

Web Services SOAP para el sistema de reservas de vuelos Volando UY.

##  Descripción

Este proyecto implementa los servicios web SOAP que exponen la funcionalidad del sistema Volando UY, permitiendo la integración con aplicaciones cliente y otros sistemas externos.

## 🛠️ Tecnologías

- **Java 21**
- **Jakarta XML Web Services (JAX-WS) 4.0.0**
- **JAX-WS Runtime 4.0.0**
- **JAXB Runtime 4.0.4**
- **Maven 3.x**

## 📦 Dependencias

El proyecto depende del módulo de lógica de negocio:
- `volando-uy-logica` (versión 1.0-SNAPSHOT)

##  Requisitos Previos

- Java Development Kit (JDK) 21 o superior
- Maven 3.x
- El módulo `volando-uy-logica` debe estar instalado en el repositorio local de Maven

## 📥 Instalación

1. Clonar el repositorio:
```bash
git clone https://github.com/mCastro-web/volando_ws.git
cd volando_ws
```

2. Instalar la dependencia de lógica de negocio (si aún no está instalada):
```bash
# Navegar al proyecto volando-uy-logica e instalarlo
cd ../volando-uy-logica
mvn clean install
cd ../volando_ws
```

3. Compilar el proyecto:
```bash
mvn clean package
```

##  Ejecución

### Modo Desarrollo

Para ejecutar en modo desarrollo:

```bash
mvn exec:java
```

### Modo Producción

Para ejecutar el JAR ejecutable generado:

```bash
java -jar target/volandouy-ws-1.0-SNAPSHOT.jar
```

## Estructura del Proyecto

```
volando_ws/
├── src/
│   └── main/
│       └── java/
│           └── publishers/
│               └── Publish.java
├── pom.xml
└── README.md
```

## 📝 Características

- **Servicios SOAP**: Implementación completa de servicios web SOAP usando JAX-WS
- **JAR Ejecutable**: Generación automática de JAR con todas las dependencias incluidas mediante Maven Shade Plugin
- **Clase Principal**: `publishers.Publish` - Punto de entrada para publicar los servicios web

## 🔧 Configuración de Maven

### Plugins Utilizados

- **Maven Shade Plugin (3.5.1)**: Genera un JAR ejecutable con todas las dependencias empaquetadas
- **Exec Maven Plugin (3.1.0)**: Permite ejecutar el proyecto directamente desde Maven para desarrollo

##  Endpoints

Los servicios SOAP se publican a través de la clase `Publish`. Los endpoints específicos dependen de la configuración establecida en el código.



## 📄 Licencia

Este proyecto cuenta con Licencia MIT.

##  Proyectos Relacionados

- [volandouy_src](https://github.com/mCastro-web/volando_src) - Módulo de lógica de negocio


##  Soporte

Para reportar problemas o solicitar nuevas características, por favor abre un issue en el repositorio de GitHub.

---

**Nota**: Este proyecto requiere el módulo `volando-uy-logica` para funcionar correctamente. Asegúrate de tener todas las dependencias instaladas antes de ejecutar.