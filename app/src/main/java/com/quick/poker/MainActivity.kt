package com.quick.poker

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.*
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    internal var deck = Deck()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById<View>(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        deck.shuffle()
        recyclerView = findViewById(R.id.recycler)
        recyclerView!!.setHasFixedSize(true)
        recyclerView!!.layoutManager = LinearLayoutManager(this)
        recyclerView!!.adapter = PokerAdapter()
    }

    inner class PokerAdapter : RecyclerView.Adapter<PokerAdapter.PokerHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, p1: Int): PokerHolder {
            return PokerHolder(LayoutInflater.from(parent.context).inflate(R.layout.poker_row, parent, false))
        }

        override fun getItemCount(): Int {
            return deck.cards.size
        }

        override fun onBindViewHolder(holder: PokerHolder, position: Int) {
            holder.pokerText?.text = deck.cards.get(position).get()
        }

        inner class PokerHolder(val view:View) : RecyclerView.ViewHolder(view) {
            var pokerText: TextView? = null
            init {
                pokerText = view.findViewById(R.id.row_text)
            }
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)

    }
}
