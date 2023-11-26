import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(var context: Context?, var factory: SQLiteDatabase.CursorFactory?): SQLiteOpenHelper(context, DATABASE_NAME, factory, DATABASE_VERSION) {

    companion object{
        val DATABASE_NAME = "locationStock"
        val DATABASE_VERSION = 1
        val TABLE_LOCATION = "locations"
        val ID1 = "id"
        val NAME_COL = "name_organisme"
        val TYPE_COL = "type_organisme"
        val DUREE_COL = "duree_organisme"
        val TABLE_ORDINATEUR = "Ordinateur"
        val ID2 = "idOrdinateur"
        val DISQUE_DUR = "dd"
        val PROCESEUR = "p"
        val RAM = "ram"
        val REFERENCE = "ref"
        val MARQUE = "marque"
        val PRIXLOC = "prixLoc"
        val TABLE_ADD_ORDINATEUR = "locations_ordinateur"
        val ID3 = "id"
        val FOREIGN_KEY1 = "id_location"
        val FOREIGN_KEY2= "id_ordinateur"
        val CONSTRAINT_FK_COLUMN1 = "fk_column1"
        val CONSTRAINT_FK_COLUMN2 = "fk_column2"
    }
    override fun onCreate(db: SQLiteDatabase){
        val query = "CREATE TABLE $TABLE_LOCATION ( $ID1 INTEGER PRIMARY KEY AUTOINCREMENT,$NAME_COL TEXT, $TYPE_COL TEXT, $DUREE_COL INTEGER )"
        db.execSQL(query)
        val query2 = "CREATE TABLE $TABLE_ORDINATEUR ( "+
                       "$ID2 INTEGER PRIMARY KEY AUTOINCREMENT,"+
                       "$DISQUE_DUR TEXT," +
                       "$PROCESEUR TEXT,"+
                       "$RAM INTEGER,"+
                       "$REFERENCE TEXT,"+
                       "$MARQUE TEXT,"+
                       "$PRIXLOC REAL)"
        db.execSQL(query2)
        val query3 = "CREATE TABLE $TABLE_ADD_ORDINATEUR( "+
                " $FOREIGN_KEY1 INTEGER, "+
                " $FOREIGN_KEY2 INTEGER,"+
                "CONSTRAINT $CONSTRAINT_FK_COLUMN2 FOREIGN KEY ($FOREIGN_KEY2) REFERENCES $TABLE_ORDINATEUR($ID2),"+
                "CONSTRAINT $CONSTRAINT_FK_COLUMN1 FOREIGN KEY ($FOREIGN_KEY1) REFERENCES $TABLE_LOCATION($ID1))"
        db.execSQL(query3)
    }
    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LOCATION)
        onCreate(db)
    }
    fun addLocation(nameOrganisation: String, typeOrganisation: String, dureeOrganisation: Int){
        val values = ContentValues()
        values.put(NAME_COL, nameOrganisation)
        values.put(TYPE_COL, typeOrganisation)
        values.put(DUREE_COL, dureeOrganisation)

        val db = this.writableDatabase
        db.insert(TABLE_LOCATION, null, values)
        db.close()

    }
//    fun addOrdinateur
}























