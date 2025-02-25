package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaInicial(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.CenterStart
    ) {
        Card(
            modifier = Modifier
                .height(40.dp)
                .width(120.dp)
                .align(Alignment.TopEnd),
            shape = RoundedCornerShape(
                topEnd = 12.dp,
                bottomStart = 12.dp,
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFD42CF1)
            )
        ) {}
        Card(
            modifier = Modifier
                .height(40.dp)
                .width(120.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 12.dp,
                bottomStart = 12.dp,
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFD42CF1)
            )
        ) {}
        Column(
            modifier = Modifier
                .padding(horizontal = 15.dp)
                .padding(bottom = 95.dp)
        ) {
            Column(
                modifier = Modifier
            ) {
                Text(
                    text = stringResource(br.senai.sp.jandira.mytrips.R.string.string_user_login),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFD42CF1)
                )
                Text(
                    text = stringResource(br.senai.sp.jandira.mytrips.R.string.text_login),
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            }
            Column(
                modifier = Modifier
                    .padding(top = 90.dp)
                ,

            ) {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    label = {
                        Text(text = stringResource(br.senai.sp.jandira.mytrips.R.string.email))
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(0xFFD42CF1)
                        )
                    }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 15.dp),
                    shape = RoundedCornerShape(12.dp),
                    label = {
                        Text(text = stringResource(br.senai.sp.jandira.mytrips.R.string.password))
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(0xFFD42CF1)
                        )
                    }
                )
                Button(
                    onClick = {},
                    modifier = Modifier
                        .align(alignment = Alignment.End)
                        .padding(bottom = 15.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFD42CF1)
                    )
                ) {
                    Text(
                        text = stringResource(br.senai.sp.jandira.mytrips.R.string.sign_in),
                    )
                    Icon(
                        modifier = Modifier
                            .padding(start = 5.dp),
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = ""
                    )
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        modifier = Modifier
                            .padding(end = 5.dp),
                        text = stringResource(br.senai.sp.jandira.mytrips.R.string.account),
                        fontSize = 15.sp,
                        color = Color.Gray
                    )
                    Text(
                        text = stringResource(br.senai.sp.jandira.mytrips.R.string.sign_up),
                        fontSize = 15.sp,
                        color = Color(0xFFD42CF1)
                    )
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview() {
    TelaInicial()
}