# Prueba
                    COMANDOS UTILIZADOS 
-Versión de git
  git version
-Registrar nuevo usuario asociado a git:
  git config --global user.name "mi nombre"
  git config --global user.email "myemail@example.com"
  git config user.name
  git config user.email
-Iniciar un nuevo repositorio y crear la carpeta oculta .git. Este comando solo se ejecuta una vez por proyecto
  git init
-Ver que archivos no han sido registrados
  git status -s
-Agregar todos los archivos para que esté pendiente de los cambios
  git add .
-Crear commit (fotografía del proyecto en ese momento)
  git commit -m "primer commit"
-Muestra la lista de commit del mas reciente al más antigüo
  git log --oneline
-Vemos información de la rama maestra
  git status -s -b
-Para futuros cambios y subir los registros
  git add .
  git commit -m "nuevo commit"
  git push
 -Nos muestra el identificador para poder revisar el historial de commit
  git log --oneline
 -Para visitar un commit en específico
  git checkout
 -Para movernos entre los diferentes commit que tengamos registrados
   git reset
 -Viajamos al commit en específico
    git reset --mixed c97d996
 -Para viajar a un commit en específico y eliminamos los cambios futuros
     git reset --hard
 -Para resturar los cambios podemos utilizar reflog: muestra todos los cambios incluso si borramos los commit
     git reflog
-Crea una nueva rama
  git branch nombreRama
-Nos muestra en que rama estamos
  git branch
-Nos movemos a la nueva rama
  git checkout nombreRama
-Nos muestra visualmente las ramas
  git log --oneline --graph
  git push --set-upstream origin nombreRama  
-Para unir una rama con la nueva tenemos que estar en la rama y ejecutar el siguiente comando:
  git merge nombreRama
-Para eliminar la rama 
  git branch -d nombreRama
-Crear un tags
  git tag versionAlpha -m "versión alpha"
-Listar tags
  git tag
-Borrar tags
  git tag -d nombreTags
  
  
                 ACCIONES Y METODOLOGIA UTILIZADA 
Primero me e conectado desde el vs al repositorio de github con mi usuario y mi correo, despues lo he clonado a mi maquina local y a partir de hay he configurado el repositorio.
He creado 6 ramas en vez de 5 como pedia el ejersicio poque la rama Feature no savia como dividirla en dos dentro de la misma.
Una vez creadas las ramas en la rama master que en mi caso es la rama main, porque es la que me creaba por defecto el repositorio, he introducido un directorio (de un ejersicio de lenguajes a modo paguina web para que se visalize despies con el index, cosa que no hace).
A continuacion fui creando poco a poco el flujo de trabajo creando tres versiones diferentes en la rama principal, cada una de ellas editada con las subramas tal y como pedia el ejersicio.
Una vez terminado hize un push para subir los datos al repositorio en GITHUB
  
