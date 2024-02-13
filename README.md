# Client - TDD Bitcoin Converter

Esta proyecto basado en una consola cliente que importa y utiliza el artefacto de la libreria bitcoin-converter-svc-lib-1.0.0.jar creado por GitHub Action.

## Requerimientos

Descargar el ```bitcoin-converter-svc-lib-1.0.0.jar``` de la sección Releases en el repositorio [TDD-Java-BitcoinConverter](https://github.com/marrsd/TDD-Java-BitcoinConverter) y agregar el archivo a la carpeta [./libs](https://github.com/marrsd/Client-TDD-Java-BitcoinConverter/tree/main/libs). (Reemplazar si hay un archivo ya almacenado)

Usar Maven para instalar la librería localmente:

```
cd ./client

FILE=`ls libs\`

mvn install:install-file \
 -Dfile=./libs/$FILE \
 -DgroupId=com.practicejava.tdd \
 -DartifactId=bitcoin-converter-svc-lib \
 -Dversion=1.0.0 \
 -Dpackaging=jar
```

Actualizar el archivo ```pom.xml``` y agregar la dependencia de la librería ```bitcoin-converter-svc-lib```. Actualizar la ```<version>``` a la del artefacto descargado.

```
<dependency>
    <groupId>com.practicejava.tdd</groupId>
    <artifactId>bitcoin-converter-svc-lib</artifactId>
    <version>1.0.0</version>
</dependency>
```

Build, test y package sobre el proyecto:

```
mvn clean package
```

Ejecutamos en consola el proyecto:

```
java -jar target/bitcoin-converter-client-1.0.0-SNAPSHOT-jar-with-dependencies.jar
```

Al ejecutar el comando anterior, en consola nos pide que ingresemos el valor al que queremos conocer el tipo de cambio actual de Bitcoin para la divisa dada (USD, GBP o EUR)

Ejemplo:
```
Coins: 300
Currency (USD, GBP, or EUR): EUR
300.0 Bitcoin = 13885356,6000 EUR
```

Para terminar ejecutamos ```Ctrl + C```