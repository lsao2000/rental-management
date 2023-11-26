package com.example.locationmanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Button
import DBHelper
import android.widget.Toast

class AddLocation : Fragment() {
    private lateinit var view: View
    private lateinit var nameOrganisation: EditText
    private lateinit var typeOrganisation: EditText
    private lateinit var dureeOrganisation: EditText
    lateinit var nameOrgaValue: String
    lateinit var typeOragValue: String
    lateinit var dureeOragValue: String
    private lateinit var saveBtn: Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_add_location, container, false)
        nameOrganisation = view.findViewById(R.id.nameOrganisation)
        typeOrganisation = view.findViewById(R.id.type_organisation)
        dureeOrganisation = view.findViewById(R.id.duree_location)
        saveBtn = view.findViewById(R.id.send)
        saveBtn.setOnClickListener{
            nameOrgaValue = nameOrganisation.text.toString()
            typeOragValue = typeOrganisation.text.toString()
            dureeOragValue = dureeOrganisation.text.toString()
            try {
                var db = DBHelper(this.context, null)
                db.addLocation(nameOrgaValue, typeOragValue, dureeOragValue.toInt())
                //Toast.makeText(this.context,"name: $nameOrgaValue\ntype: $typeOragValue\nduree: $dureeOragValue", Toast.LENGTH_LONG).show()
                nameOrganisation.text.clear()
                typeOrganisation.text.clear()
                dureeOrganisation.text.clear()
            } catch(e: Exception){
                Toast.makeText(this.context, "the addition was not success complete. ", Toast.LENGTH_LONG).show()

            }
        }

        return  view
    }

}
