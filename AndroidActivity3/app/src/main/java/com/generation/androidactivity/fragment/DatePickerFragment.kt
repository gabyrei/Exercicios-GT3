package com.generation.androidactivity.fragment

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import com.generation.androidactivity.adapter.getItemCout
import java.time.LocalDate
import java.time.ZoneId
import java.util.*

class DatePickerFragment (
    val timerPickerListener: TimerPickerListener
        ): DialogFragment(),   DatePickerDialog.OnDateSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day= c.get(Calendar.DAY_OF_MONTH)

        return DatePickerDialog(requireContext(), this, year , month,day)
    }

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
       val calendar = Calendar.getInstance()
        calendar.set(Calendar.YEAR, p1)
        calendar.set(Calendar.MONTH, p2)
        calendar.set(Calendar.DAY_OF_MONTH, p3)

        timerPickerListener.onDateSelected(calendar.time.toInstant().atZone(
            ZoneId.systemDefault())).toLocalDate())
    }
    }

 }
           interface TimerPickerListener{
               fun onDateSelected(date: LocalDate)
           }