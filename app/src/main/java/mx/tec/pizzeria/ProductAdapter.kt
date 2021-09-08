package mx.tec.pizzeria

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_pizza1.view.*
import kotlinx.android.synthetic.main.item_product.view.*
import java.math.MathContext

class ProductAdapter(private val mContext: Context, private val listaProductos: List<Pizzas>): ArrayAdapter<Pizzas>(mContext, 0, listaProductos){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_product,parent, false)

        val pizzas = listaProductos[position]

        layout.tv_nombre.text = pizzas.nombre
        layout.tv_precio.text = "$${pizzas.precio}"
        layout.imageView2.setImageResource(pizzas.imagen)
        layout.tv_info.text = pizzas.info

        return layout
    }
}