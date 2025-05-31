package com.konkuk.kuitprojectsetting.core.util.date

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun LocalDate.formatToKorean(): String {
    val formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")
    return this.format(formatter)
}

//ViewModel이나 Screen 파일에서
//val today = LocalDate.now() //2025-05-28
//val formatted = today.formatKorean()  // "2025년 05월 28일"

