package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.data.MenuRepository.getRandomPrice
import com.hitanshudhawan.mccompose.model.Home
import com.hitanshudhawan.mccompose.model.MenuItem
import com.hitanshudhawan.mccompose.model.User

object HomeRepository {

    fun getHomeData(): Home {
        return Home(
            user = User(
                name = "Nael"
            ),
            categories = CategoriesRepository.getCategoriesData(),
            popularMenuItems = listOf(
                MenuItem(
                    id = 4003,
                    name = "Hackathon de Sécurité Informatique",
                    description = "es participants travaillent en équipes pour identifier et résoudre des vulnérabilités de sécurité dans des systèmes de télécommunications, en mettant à l'épreuve leurs compétences en piratage éthique et en résolution de problèmes.",//"Refuel with a Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. The Quarter Pounder with Cheese Combo Meal is served with our World Famous Fries and your choice of an icy medium fountain drink.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4004,
                    name = "Robotique Télécom",
                    description = "Les équipes construisent et programment des robots capables de réaliser des tâches liées aux télécommunications, telles que le déploiement de réseaux de capteurs, la collecte de données ou la maintenance d'infrastructures.",//"Get double the fresh beef flavor with a Double Quarter Pounder with Cheese made with fresh beef that’s cooked when you order. Served with our World Famous Fries and your choice of an icy soft drink.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4005,
                    name = "Concours de Développement d'Applications Mobiles",
                    description = "Les participants créent des applications mobiles innovantes axées sur les télécommunications, en mettant l'accent sur la convivialité, les fonctionnalités avancées et l'intégration avec les réseaux existants.",//"Enjoy 10 tender and delicious Chicken McNuggets made with all white meat chicken—plus our World Famous Fries and your choice of a Medium McDonald’s drink with the 10 Piece McNuggets for the ultimate McDonald’s Combo Meal.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4006,
                    name = "Défi de Cryptographie et de Sécurité des Données",
                    description = "Les participants résolvent des défis liés à la cryptographie et à la sécurité des données, en mettant à l'épreuve leurs compétences en déchiffrement, en analyse de protocoles et en protection des communications.",//"A classic fish sandwich value meal made with wild-caught Alaskan Pollock on a regular McDonald’s bun, served with our World Famous Fries and your choice of an icy soft drink. Enjoy a Filet-O-Fish Meal today.",
                    image ="",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 2001,
                    name = "Tournoi eSport Interuniversitaire",
                    description = "Organisez un tournoi de jeux vidéo en ligne où les équipes représentent différentes universités. Les jeux populaires comme League of Legends, Counter-Strike: Global Offensive, FIFA, ou Rocket League pourraient être inclus.",//"Our World Famous Fries are made with premium potatoes such as the Russet Burbank and the Shepody. With 0g of trans fat per labeled serving, these epic fries are crispy and golden on the outside and fluffy on the inside.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 2
                ),
                MenuItem(
                    id = 1008,
                    name = "Fête de la Technologie Avancée",
                    description = "Cette fête met en avant les dernières avancées en matière de technologie, avec des démonstrations de gadgets innovants, des expositions sur l'intelligence artificielle, la réalité virtuelle et augmentée, ainsi que des conférences sur les tendances technologiques émergentes.",//"The McDonald’s Double Cheeseburger features two 100% pure beef burger patties seasoned with just a pinch of salt and pepper. It’s topped with tangy pickles, chopped onions, ketchup, mustard and two slices of melty American cheese.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
//
            ),
            recommendedMenuItems = listOf(
                MenuItem(
                    id = 1003,
                    name = "Soirée Gaming en Réseau",
                    description =  "Offrant une expérience de jeu en réseau, cette fête permet aux participants de se connecter via des jeux en ligne, de participer à des tournois, et de découvrir comment les jeux vidéo et les communications interagissent dans le monde numérique.",//"Each Double Quarter Pounder with Cheese features two quarter pound 100% fresh beef burger patties that are hot, deliciously juicy and cooked when you order. McDonald’s beef patties are seasoned with just a pinch of salt and pepper, sizzled on a flat iron grill, then topped with slivered onions, tangy pickles and two slices of melty cheese on a sesame seed bun.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1001,
                    name = "Soirée Hackathon",
                    description = "Cette fête offre une plateforme pour des défis de piratage éthique, où les étudiants peuvent collaborer pour résoudre des problèmes de sécurité, développer des applications innovantes et découvrir de nouvelles façons d'utiliser la technologie de manière créative.",//"Mouthwatering perfection starts with two 100% pure beef patties and Big Mac sauce sandwiched between a sesame seed bun. It’s topped off with pickles, crisp shredded lettuce, finely chopped onion and American cheese.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 3003,
                    name = "Innovation Technologique",
                    description = "Cette conférence met en lumière les dernières innovations technologiques dans le domaine des télécommunications, avec des présentations sur les avancées en matière de matériel, de logiciels, d'algorithmes et de protocoles.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 6002,
                    name = "Cérémonie de Clôture",
                    description = "Une cérémonie finale pour marquer la fin de l'événement, comprenant des discours de clôture, des remerciements aux sponsors, aux conférenciers et aux participants, ainsi qu'une rétrospective des moments forts de l'événement.",//"Our classic hot fudge sundae is made with creamy vanilla soft serve and smothered in chocolaty hot fudge topping.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 6
                ),
//
                MenuItem(
                    id = 6001,
                    name = "Remise des Prix",
                    description = "Une cérémonie pour honorer les gagnants des concours, des challenges et des compétitions organisés pendant l'événement, avec la remise de trophées, de certificats et de récompenses spéciales aux participants méritants.",//"Enjoy our creamy vanilla soft serve in a crispy cone! It's the perfect sweet treat in addition to any McDonald's meal or on its own!",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 6
                ),
//
            )
        )
    }

}
