package com.example.spiski

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var actorsAdapter: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyc.layoutManager = LinearLayoutManager(this)

         var actorsList: MutableList<Actor> = ArrayList()


        actorsAdapter = RvAdapter(actorsList)
        recyc.adapter = actorsAdapter


        var i = 0


        val names = listOf<String>("Pasha", "igor", "Artem", "vasya", "masha")
        val avas = listOf<String>(
            "https://avatars.mds.yandex.net/get-zen_doc/1350031/pub_5dc44ca65ba2b500ae6bb3e0_5dc44f638d5b5f00b12ecf15/scale_1200",
            "https://pbs.twimg.com/profile_images/1237843522243268611/vp4Gdu8F_400x400.jpg",
            "https://cs11.pikabu.ru/post_img/big/2018/10/27/11/154066832316199744.jpg",
            "https://i.artfile.ru/1920x1080_705103_%5Bwww.ArtFile.ru%5D.jpg",
            "https://get.wallhere.com/photo/illustration-cartoon-panda-kung-fu-panda-3-2016-kids-screenshot-553140.jpg",
        )
        val oskars = listOf<Boolean>(true, false, true, false, true)


        buttonStart.setOnClickListener {
            i = Random.nextInt(0,4)
            actorsAdapter.addActor(0, Actor(name = names[i],avatar = avas[i],oskar = oskars[i]))

        }

        buttonCenter.setOnClickListener {
            i = Random.nextInt(0,4)
            actorsAdapter.addActor(actorsList.size/2, Actor(name = names[i],avatar = avas[i],oskar = oskars[i]))

        }

        buttonEnd.setOnClickListener {
            i = Random.nextInt(0,4)
            actorsAdapter.addActor(actorsList.size , Actor(name = names[i],avatar = avas[i],oskar = oskars[i]))
        }

        actorsList.add(
            Actor(
                name = "Pasha Ivanov",
                avatar = "https://cs11.pikabu.ru/post_img/big/2018/10/27/11/154066832316199744.jpg",
                oskar = true
            )
        )
        actorsList.add(
            Actor(
                name = "Sobaka Sutulaya",
                avatar = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fpikabu.ru%2Fstory%2Fkogda_yepitet_sobaka_sutulaya_ne_oskorblenie_a_prosto_opisanie_6881595&psig=AOvVaw089_xkVM6Ull8q0HtlF6Sx&ust=1604314455820000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPD3pZ2X4ewCFQAAAAAdAAAAABAD",
                oskar = false
            )
        )
        actorsList.add(
            Actor(
                name = "Alena Suchara",
                avatar = "https://sun9-50.userapi.com/ehao7XCCEdxCvpv1ZjFvbTUqIG0p5637QbANxg/25NSYavSTQI.jpg",
                oskar = true
            )
        )
        actorsList.add(
            Actor(
                name = "korch svoloch'",
                avatar = "https://vk.com/vochik2016?z=photo333731853_457254178%2Fphotos333731853",
                oskar = false
            )
        )
        actorsList.add(
            Actor(
                name = "Pasha Ivanov",
                avatar = "https://pbs.twimg.com/profile_images/1237843522243268611/vp4Gdu8F_400x400.jpg",
                oskar = true
            )
        )
        //recyc.adapter = RvAdapter(actorsList)

    }
}


data class Actor(val name: String, val avatar: String, val oskar: Boolean)
//recyc.scrollToPosition(list.size/2)recyc.scrollToPosition(list.size/2)
/*buttonCenter.setOnClickListener {
            list.add(
                index = list.size / 2,
                Actor(
                    "${names[i]}",
                    "${avas[i]}",
                    oskar = oskars[i]
                )
            )
            recyc.adapter = RvAdapter(list)
            i++*/
