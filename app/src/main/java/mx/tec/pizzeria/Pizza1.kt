package mx.tec.pizzeria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pizza1.*
import kotlinx.android.synthetic.main.item_product.*

class Pizza1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza1)

        val producto = intent.getSerializableExtra("producto") as Pizzas

        tvg_nombre.text = producto.nombre
        tvg_precio.text = "$${producto.precio}"
        tvg_info.text = producto.info
        imageView3.setImageResource(producto.imagen)

    }
}