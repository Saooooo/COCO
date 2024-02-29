package iut.saobane.coco

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun loginDisplay(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val loginValue = remember { mutableStateOf("") }
        val mdpValue = remember { mutableStateOf("") }

        Text(
            text = "Authentification",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        )

        Spacer(modifier = Modifier.height(75.dp))

        Text(text = "Votre login", fontSize = 15.sp)
        TextField(
            value = loginValue.value,
            onValueChange = { loginValue.value = it },
            modifier = Modifier.padding(5.dp),
            placeholder = { Text("Login...") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Mot de passe", fontSize = 15.sp)
        TextField(
            value = mdpValue.value,
            onValueChange = { mdpValue.value = it },
            modifier = Modifier.padding(5.dp),
            placeholder = { Text("Mot de passe...") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate("accueil/${loginValue.value}/${mdpValue.value}")
            }
        ) {
            Text(text = "Valider", fontSize = 17.sp)
        }
    }
}
