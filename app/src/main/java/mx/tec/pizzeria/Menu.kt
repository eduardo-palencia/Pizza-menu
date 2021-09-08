package mx.tec.pizzeria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val pizza_cf = Pizzas("Carnes Frias", 149.99, R.drawable.cf, "Ingredientes: Pepperoni, Salami, Jamón y Finas Hierbas")
        val pizza_hnc = Pizzas("Hawaiana", 129.99, R.drawable.hnc, "Ingredientes: Jamón y Piña")
        val pizza_vgp = Pizzas("Vegetariana", 119.99, R.drawable.vgp, "Ingredientes: Pimiento, Cebolla, Champiñones Frescos y Aceitunas")
        val pizza_mex = Pizzas("Mexicana", 139.99, R.drawable.mex, "Ingredientes: Chorizo, Carne Molida, Cebolla y Jalapeño")
        val pizza_cuatroq = Pizzas("Cuatro quesos", 129.99, R.drawable.cuatroq, "Ingredientes: Queso Crema, Mozzarella, Parmesano y Cheddar")


        val listaPizzas = listOf(pizza_cf,pizza_hnc,pizza_vgp,pizza_mex,pizza_cuatroq)
        val adapter = ProductAdapter(this, listaPizzas)

        lst_pizzas.adapter = adapter

        lst_pizzas.setOnItemClickListener {parent, view, position, id ->
            val intent = Intent(this, Pizza1::class.java)
            intent.putExtra("producto", listaPizzas[position])
            startActivity(intent)
        }
    }
}
