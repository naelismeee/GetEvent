package com.hitanshudhawan.mccompose.ui.components

import androidx.compose.animation.animateColor
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Done
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.hitanshudhawan.mccompose.ui.theme.McComposeTheme


private enum class QuantityToggleState { Zero, NonZero }

@Composable
fun QuantityToggle(
    quantity: Int,
    onIncrementQuantity: () -> Unit,
    onDecrementQuantity: () -> Unit,
) {

    val transition = updateTransition(if (quantity == 0) QuantityToggleState.Zero else QuantityToggleState.NonZero)

    val backgroundColor by transition.animateColor { state ->
        when (state) {
            QuantityToggleState.Zero -> MaterialTheme.colors.background
            QuantityToggleState.NonZero -> MaterialTheme.colors.secondary
        }
    }
    val contentColor by transition.animateColor { state ->
        when (state) {
            QuantityToggleState.Zero -> MaterialTheme.colors.secondary
            QuantityToggleState.NonZero -> LocalContentColor.current
        }
    }
    val iconSize by transition.animateDp { state ->
        when (state) {
            QuantityToggleState.Zero -> 0.dp
            QuantityToggleState.NonZero -> 18.dp
        }
    }

    Surface(
        modifier = Modifier
            .width(90.dp)
            .aspectRatio(2.75f),
        shape = MaterialTheme.shapes.small,
        color = backgroundColor,
        contentColor = contentColor,
        border = BorderStroke(2.dp, MaterialTheme.colors.secondary)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = if (quantity == 0) onIncrementQuantity else onDecrementQuantity),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Rounded.Done,
                modifier = Modifier.size(iconSize)
            )
            Text(
                text = if (quantity == 0) "Participé" else "Participé",
                style = MaterialTheme.typography.button,
                modifier = Modifier.animateContentSize()
            )
        }
    }
}

@Preview("QuantityToggle • Zero")
@Composable
private fun QuantityToggleZeroPreview() {
    McComposeTheme {
        QuantityToggle(
            quantity = 0,
            onIncrementQuantity = {},
            onDecrementQuantity = {},
        )
    }
}

@Preview("QuantityToggle • NonZero")
@Composable
private fun QuantityToggleNonZeroPreview() {
    McComposeTheme {
        QuantityToggle(
            quantity = 1,
            onIncrementQuantity = {},
            onDecrementQuantity = {},
        )
    }
}

@Preview("QuantityToggle • Zero • Dark")
@Composable
private fun QuantityToggleZeroDarkPreview() {
    McComposeTheme(lightTheme = false) {
        QuantityToggle(
            quantity = 0,
            onIncrementQuantity = {},
            onDecrementQuantity = {},
        )
    }
}

@Preview("QuantityToggle • NonZero • Dark")
@Composable
private fun QuantityToggleNonZeroDarkPreview() {
    McComposeTheme(lightTheme = false) {
        QuantityToggle(
            quantity = 1,
            onIncrementQuantity = {},
            onDecrementQuantity = {},
        )
    }
}