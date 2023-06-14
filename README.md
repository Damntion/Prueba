# Prueba
                    COMANDOS UTILIZADOS 
- Versión de git: `git version`
- Registrar nuevo usuario asociado a git:
  - `git config --global user.name "mi nombre"`
  - `git config --global user.email "myemail@example.com"`
- Ver el nombre de usuario y correo asociado:
  - `git config user.name`
  - `git config user.email`
- Iniciar un nuevo repositorio y crear la carpeta oculta .git. Este comando solo se ejecuta una vez por proyecto: `git init`
- Ver qué archivos no han sido registrados: `git status -s`
- Agregar todos los archivos para que estén pendientes de los cambios: `git add .`
- Crear un commit (fotografía del proyecto en ese momento): `git commit -m "primer commit"`
- Mostrar la lista de commits del más reciente al más antiguo: `git log --oneline`
- Ver información de la rama actual: `git status -s -b`
- Para futuros cambios y subir los registros:
  - `git add .`
  - `git commit -m "nuevo commit"`
  - `git push`
- Mostrar el identificador para poder revisar el historial de commits: `git log --oneline`
- Para visitar un commit en específico: `git checkout <commit>`
- Para moverse entre los diferentes commits registrados: `git reset`
- Viajar a un commit en específico y eliminar los cambios futuros: `git reset --hard`
- Para restaurar los cambios, se puede utilizar `reflog` para mostrar todos los cambios, incluso si se borraron los commits: `git reflog`
- Crear una nueva rama: `git branch <nombreRama>`
- Mostrar en qué rama estamos: `git branch`
- Moverse a la nueva rama: `git checkout <nombreRama>`
- Mostrar visualmente las ramas: `git log --oneline --graph`
- Enlazar la rama actual con una rama nueva: `git push --set-upstream origin <nombreRama>`
- Para unir una rama con la nueva, estar en la rama y ejecutar el siguiente comando: `git merge <nombreRama>`
- Para eliminar una rama: `git branch -d <nombreRama>`
- Crear un tag: `git tag <nombreTag> -m "versión alpha"`
- Listar tags: `git tag`
- Borrar un tag: `git tag -d <nombreTag>`

  
                 ACCIONES Y METODOLOGIA UTILIZADA 
Primero me e conectado desde el vs al repositorio de github con mi usuario y mi correo, despues lo he clonado a mi maquina local y a partir de hay he configurado el repositorio.
He creado 6 ramas en vez de 5 como pedia el ejersicio poque la rama Feature no savia como dividirla en dos dentro de la misma.
Una vez creadas las ramas en la rama master que en mi caso es la rama main, porque es la que me creaba por defecto el repositorio, he introducido un directorio (de un ejersicio de lenguajes a modo paguina web para que se visalize despies con el index, cosa que no hace).
A continuacion fui creando poco a poco el flujo de trabajo creando tres versiones diferentes en la rama principal, cada una de ellas editada con las subramas tal y como pedia el ejersicio.
Una vez terminado hize un push para subir los datos al repositorio en GITHUB
  
