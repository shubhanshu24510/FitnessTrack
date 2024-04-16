package com.example.fitnesstrack.presentation

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitnesstrack.R

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ExploreSection(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(14.dp),
        text = stringResource(id = R.string.explore),
        fontSize = 20.sp,
        fontFamily = FontFamily.Default,
        color = Color.Black
    )
    Column(modifier = Modifier.padding(start = 5.dp, end = 5.dp, bottom = 5.dp)) {
        ExploreCard(
            title = stringResource(id = R.string.find_diets),
            description = stringResource(id = R.string.des_find_diets),
            logo = painterResource(id = R.drawable.find_diets)
        )

        ExploreCard(
            title = stringResource(id = R.string.find_nutritions),
            description = stringResource(id = R.string.des_find_nutritions),
            logo = painterResource(id = R.drawable.find_nutitions)
        )

    }

}

//@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreCard(
    title: String,
    description: String,
    logo: Painter,
) {
    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier.padding(14.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(modifier = Modifier.height(100.dp)) {
            Image(
                painter = logo,
                contentDescription = "find diets",
                contentScale = ContentScale.Fit,
                alignment = Alignment.Center
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = title,
                    fontSize = 17.sp,
                    fontStyle = FontStyle.Normal,
                    color = Color.Black,
                    overflow = TextOverflow.Ellipsis,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight(400)
                )
                Spacer(modifier = Modifier.padding(4.dp))
                Text(
                    text = description,
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Normal,
                    overflow = TextOverflow.Ellipsis,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight(400)
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GoalSection(modifier: Modifier = Modifier) {
    Text(
        modifier = Modifier.padding(14.dp),
        text = stringResource(id = R.string.your_goals),
        fontSize = 20.sp,
        fontFamily = FontFamily.Default,
        color = Color.Black
    )
    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .padding(start = 14.dp, bottom = 14.dp, end = 14.dp)
            .height(80.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(modifier = Modifier.height(107.dp)) {
            Image(
                painter = painterResource(id = R.drawable.goals_logo),
                contentDescription = "find diets",
                contentScale = ContentScale.Fit,
                alignment = Alignment.Center,
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = stringResource(id = R.string.goals_title),
                    fontSize = 17.sp,
                    fontStyle = FontStyle.Normal,
                    color = Color.Black,
                    overflow = TextOverflow.Ellipsis,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight(400)
                )
                Spacer(modifier = Modifier.padding(1.dp))
                Text(
                    text = stringResource(id = R.string.goals_des),
                    fontSize = 15.sp,
                    fontStyle = FontStyle.Normal,
                    overflow = TextOverflow.Ellipsis,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight(300)
                )
            }
        }
    }
}


//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun ProgressSection(modifier: Modifier = Modifier) {
//    Canvas(modifier = Modifier.fillMaxSize()) {
//        scale(scaleX = 10f, scaleY = 15f) {
//            drawCircle(Color.Blue, radius = 20.dp.toPx())
//        }
//    }
//}