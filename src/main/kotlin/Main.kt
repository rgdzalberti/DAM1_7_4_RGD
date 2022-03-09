// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.application
import androidx.compose.ui.window.Window


fun launchChrome(link: String){
    Runtime.getRuntime().exec(arrayOf("cmd", "/c", "start chrome ${link}"))
}

fun playSound(path: String){

}

@Composable
fun botonContador(){
    var counter by remember { mutableStateOf(0) }
    var buttonColor = Color(0xFFFFE77A)
    var kindblue = Color(0xFF234E70)

    Button(
        onClick = { counter++ },
        colors = ButtonDefaults.textButtonColors(backgroundColor = buttonColor)
    ) {
        Text("CLICKS: $counter", fontSize = 30.sp,fontFamily = FontFamily.Serif,color = kindblue)
    }
}
@Composable
fun botonTwitter(){
    var buttonColor = Color(0xFFFFE77A)
    var twitterBlue = Color(0xFF00ACEE)
    Button(
        onClick = { launchChrome("twitter.com") },
        colors = ButtonDefaults.textButtonColors(backgroundColor = twitterBlue)
    ) {
        Text("Twitter", fontSize = 11.sp,fontFamily = FontFamily.Serif,color = Color.White)
    }
}
@Composable
fun botonInstagram(){
    var buttonColor = Color(0xFFFFE77A)
    var instagramPink = Color(0xFFE1306C)
    Button(
        onClick = { launchChrome("instagram.com") },
        colors = ButtonDefaults.textButtonColors(backgroundColor = instagramPink)
    ) {
        Text("Instagram", fontSize = 11.sp,fontFamily = FontFamily.Serif,color = Color.White)
    }
}

@Composable
fun botonSonido(){
    Button(onClick = {launchChrome("instagram.com")}
    )
    {
        Icon(
            painter = painterResource("sound.png"),
            null,
            tint = Color.White)
    }
}

@Composable
fun ImageResourceDemo() {
    val image: Painter = painterResource("a.jpg")
    Image(painter = image,contentDescription = "")
}


@Composable
fun paint(){

    var background = Color(0xFF234E70)
    var yellow = Color(0xffffeb46)
    var red = Color(0xffff0000)

    Surface(
        color = background,
        modifier = Modifier
            .fillMaxSize(),
    )
    {
        ImageResourceDemo()

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

        )
        {


            botonContador()

            Row(
                Modifier.padding(top = 8.dp)
            ) {
                Column(Modifier.padding(start = 4.dp)) { botonTwitter() }
                Column(Modifier.padding(start = 4.dp)) { botonInstagram() }
        }
            Column(Modifier.padding(top = 8.dp)) { botonSonido() }
        }
    }
}

fun main() = application{

    Window(onCloseRequest = ::exitApplication){

        paint()

    }


}

