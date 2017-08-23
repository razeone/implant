# implant
This is an example hello world using SparkJava

How to run this hello world?

```
./gradlew build
./gradlew run
```

Para correr las migraciones asegurarse de :
```
1) En el archivo build.gradle cambiar en la secci?n flyway la ip, usuario y pass
2) La sintaxis de los nombres de las migraciones deben de ser V#version.prejifo __(doble gui?n)Nombre.sql
3) En los archivos sql no ser?n validos comandos como CREATE DATABSE ni connect \c,etc
4) Ir a la ubicaci?n del proyecto, entrar a este y ejecutar gradle flywayMigrate -i (puede ejecutarse gradlew)
```

En la secci?n main/java/com/beeva/app  se encuentran 4 carpetas, en Entidades tenemos las entidades de la base con setters
y getters, en DAO tenemos nuestros POJOS, en Controller tenemos el archivo AppController.java en ese estan las expresiones
lambda de java spark, en estas versi?n son solo GET. En utils tenemos la conexi?n a la base y el format para que nos
regrese en forma de JSON la informaci?n.

Funciona el get Objecot y getAll de los siguientes:

```
-Proyecto
-Recurso
-Empresa
```