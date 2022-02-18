# Simples app com kotlin
Simples app para renderizar 3 imagens da internet a partir de um butao

## Feature
- Para renderizar de forma simples as imagens usei o [Picasso](https://guides.codepath.com/android/Displaying-Images-with-the-Picasso-Library)
- Abaixo esta a implementação do Picasso no código
- Novamente usei a implementação do id no build.grandlew para referenciar na [view](https://github.com/kenjimaeda54/gastos-viajens-kotlin)
 

``` xml
<manifest>
  <uses-permission android:name="android.permission.INTERNET" />
</manifest>

```

``` kotlin
import com.squareup.picasso.Picasso

val imageUri = "https://github.com/kenjimaeda54.png"
Picasso.with(this).load(imageUri).resize(200,200 ).into(imageAvatar);
````
