// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.Window
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp


@Composable
fun centralButton(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End
    ) {
        //Image("C:\\Users\\usuarioT\\Downloads\\a.png")
        Column { /*...*/ }
    }
}
@Composable
fun example(){
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Button(onClick = {
            text = "Hello, Desktop!"
        }) {
            Text(text)
        }
    }
}
@Composable
fun ArtistCard() {
    Row() {
        Text("aaaa")
        Column {
            Text("Alfred Sisley")
            Text("3 minutes ago")
        }
    }
}

@Composable
fun ventana(){

        //En surface pongo las propiedades
        Surface(

            //color = MaterialTheme.colors.primarySurface,
            //border = BorderStroke(1.dp, MaterialTheme.colors.secondary),
            //shape = RoundedCornerShape(8.dp),
            //elevation = 8.dp


        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                //AQUI GRADIENT
                                MaterialTheme.colors.primary,
                                MaterialTheme.colors.primaryVariant
                            )
                        )
                    )
                ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "example",
                    modifier = Modifier.padding(8.dp)
                )
                Row(){
                    //Text("aaaa")
                }
            }
        }

}

@Composable
fun ventana2(){
    Surface(
        //color = MaterialTheme.colors.primarySurface
    )
    {

        Column(

        )
        {
            Text("aaa")
            Row{
                Text("aa")
            }
        }
    }
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
fun botonFantasia(){

}

@Composable
fun paint(){

    var background = Color(0xFF234E70)
    var yellow = Color(0xffffeb46)
    var red = Color(0xffff0000)

    Surface(
        color = background
    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        )
        {
            botonContador()
            botonFantasia()
        }
    }
}

fun main() = Window{

    paint()

}