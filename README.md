# layout Basicos y configuracion de Constraint Layout con Boxes Text, TextField, TextField de contasenha

primera modificacion para el constraint Layout es /Gradle/libs.versions.toml

[versions]
constraintVersion = "1.1.0"


[libraries]
onstraint-layout = {module = "androidx.constraintlayout:constraintlayout-compose", version.ref = "constraintVersion"}

segunda modificacion es build.gradle.kts(Module :app)

dependencies{
  implementation(libs.constraint.layout)
}
