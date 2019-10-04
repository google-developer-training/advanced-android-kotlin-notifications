/*
 * Copyright (C) 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.eggtimernotifications.util

import android.text.format.DateUtils
import android.widget.TextView
import androidx.databinding.BindingAdapter

/**
 * Converts milliseconds to formatted mm:ss
 *
 * @param value, time in milliseconds.
 */
@BindingAdapter("elapsedTime")
fun TextView.setElapsedTime(value: Long) {
    val seconds = value / 1000
    text = if (seconds < 60) seconds.toString() else DateUtils.formatElapsedTime(seconds)
}
