class Ordinateur(var DD: String, var P: String, var ram: Int, var ref: String, var marque: String, var prixLoc:Double): Material(ref, marque, prixLoc) , IEquip{

    constructor(DD: String, P: String, ram: Int):this(DD, P, ram, "", "", 0.0)

    override fun getCaracteristiques() = when(ram > 8 && DD.equals("ssd")){
            true -> "performant"
            false -> "lourde"
    }
    


}
