package ru.cloudunion.delivery.presentation.util

import androidx.core.text.HtmlCompat

fun getRubleSign(): String {
  return "${HtmlCompat.fromHtml(" &#x20bd", HtmlCompat.FROM_HTML_MODE_COMPACT)}"
}