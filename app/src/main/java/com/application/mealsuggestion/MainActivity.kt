package com.application.mealsuggestion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts.AggregationSuggestions
import android.text.TextUtils
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import java.util.Locale

class MainActivity : AppCompatActivity(), View.OnClickListener {

    // UI Elements
    lateinit var txtTimeOfDay: EditText
    lateinit var btnGetSuggestions: Button
    lateinit var btnReset: Button
    lateinit var lstSuggestions: ListView

    // List of valid time inputs
    val listOfTimes = arrayOf("morning", "mid-morning", "afternoon", "mid-afternoon", "dinner")

    // Meal suggestions based on time of day
    val listOfMorningSuggestions = arrayOf("Eggs", "Sausage", "Bacon")
    val listOfMidMorningSuggestions = arrayOf("Muffin", "Pancakes", "Waffles")
    val listOfAfternoonSuggestions = arrayOf("Steak sandwich", "Pasta", "Stir Fry")
    val listOfMidAfternoonSuggestions = arrayOf("Mixed nuts", "Yogurt", "Muesli")
    val listOfDinnerSuggestions = arrayOf("Rice and beans", "Sirloin steak", "Burger and fries")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing UI components
        txtTimeOfDay = findViewById(R.id.txt_time)
        btnGetSuggestions = findViewById(R.id.btn_get_suggestion)
        btnReset = findViewById(R.id.btn_reset)
        lstSuggestions = findViewById(R.id.lst_suggestions)

        // Set click listeners for buttons
        btnGetSuggestions.setOnClickListener(this)
        btnReset.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            // Handle "Get Suggestion" button click
            R.id.btn_get_suggestion -> {
                val timeOfDay = txtTimeOfDay.text.toString().lowercase(Locale.getDefault())

                // Validate user input
                if (!listOfTimes.contains(timeOfDay)) {
                    txtTimeOfDay.error = "Please enter a valid time of day. Valid options are Morning, Mid-morning, Afternoon, Mid-afternoon, or Dinner"
                }

                // Display meal suggestions based on user input
                when (timeOfDay) {
                    "morning" -> lstSuggestions.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfMorningSuggestions)
                    "mid-morning" -> lstSuggestions.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfMidMorningSuggestions)
                    "afternoon" -> lstSuggestions.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfAfternoonSuggestions)
                    "mid-afternoon" -> lstSuggestions.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfMidAfternoonSuggestions)
                    "dinner" -> lstSuggestions.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfDinnerSuggestions)
                }
            }

            // Handle "Reset" button click
            R.id.btn_reset -> {
                txtTimeOfDay.setText("") // Clear input field
                lstSuggestions.adapter = null // Clear list view
            }
        }
    }
}