package rs.ac.metropolitan.student1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import rs.ac.metropolitan.student1.ui.theme.Student1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Student1Theme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Student("Android")
                }
            }
        }
    }
}

@Composable
fun Student(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(modifier = modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Button(
            onClick = {
                Toast.makeText(context, "OK clicked", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text("OK")
        }
        Button(
            onClick = {
                Toast.makeText(context, "Cancel clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text("Cancel")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Student1Theme {
        Student("Android")
    }
}
