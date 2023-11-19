import java.util.ArrayList
class Location (var organisme: Organisme, var duree_location: Int, var id: Int = Location.countId ){
    private var lstOrdinateur = ArrayList<Ordinateur>()
    companion object{
        var countId = 1
    }
    init {
        countId++
    }
    fun addOrdinateur(newOrdinateur :Ordinateur){
        if(lstOrdinateur.size > 2){
            throw Exception("3 max")
        }
        lstOrdinateur.add(newOrdinateur)
    }
    fun getLstOrdinateur() = lstOrdinateur
    fun montantTotal() = lstOrdinateur.sumOf{ it.prixLoc } * duree_location
    fun plusCher() = lstOrdinateur.maxBy { it.prixLoc }
    fun getSpecificList(name: String) = lstOrdinateur.filter { it.marque.equals("lenovo") }
    fun getnumberSpecificMarque(name: String) = getSpecificList(name).size


}
