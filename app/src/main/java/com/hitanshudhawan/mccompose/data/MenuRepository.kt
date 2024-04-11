package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Menu
import com.hitanshudhawan.mccompose.model.MenuItem

object MenuRepository {

    fun getMenuData(): Menu {
        return Menu(
            categories = CategoriesRepository.getCategoriesData(),
            menuItems = listOf(
                MenuItem(
                    id = 1001,
                    name = "Soirée Hackathon",
                    description = "Cette fête offre une plateforme pour des défis de piratage éthique, où les étudiants peuvent collaborer pour résoudre des problèmes de sécurité, développer des applications innovantes et découvrir de nouvelles façons d'utiliser la technologie de manière créative.",//"Mouthwatering perfection starts with two 100% pure beef patties and Big Mac sauce sandwiched between a sesame seed bun. It’s topped off with pickles, crisp shredded lettuce, finely chopped onion and American cheese.",
                    image = "file:///C:/Users/Nael/AndroidStudioProjects/McCompose/app/src/main/res/drawable-nodpi/new_image.png",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1002,
                    name = "Soirée Cinéma Technologique ",
                    description = "ette fête propose une sélection de films et documentaires sur les avancées technologiques, les pionniers de la télécommunication, les récits futuristes de la communication, suivis de discussions sur les thèmes abordé",//"Each Quarter Pounder with Cheese burger features a ¼ lb. of 100% fresh beef that’s hot, deliciously juicy and cooked when you order. It’s seasoned with just a pinch of salt and pepper, sizzled on a flat iron grill, then topped with slivered onions, tangy pickles and two slices of melty cheese on a sesame seed bun.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1003,
                    name = "Soirée Gaming en Réseau",
                    description =  "Offrant une expérience de jeu en réseau, cette fête permet aux participants de se connecter via des jeux en ligne, de participer à des tournois, et de découvrir comment les jeux vidéo et les communications interagissent dans le monde numérique.",//"Each Double Quarter Pounder with Cheese features two quarter pound 100% fresh beef burger patties that are hot, deliciously juicy and cooked when you order. McDonald’s beef patties are seasoned with just a pinch of salt and pepper, sizzled on a flat iron grill, then topped with slivered onions, tangy pickles and two slices of melty cheese on a sesame seed bun.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1004,
                    name = "Télécommunication Écologique",
                    description = "Mettant l'accent sur la durabilité et l'écologie, cette fête explore comment les télécommunications peuvent être utilisées pour promouvoir la conservation de l'énergie, réduire l'empreinte carbone, et encourager les pratiques respectueuses de l'environnement dans le domaine des communications.",//"The Quarter Pounder with Cheese Deluxe is a fresh take on a Quarter Pounder classic burger. Crisp leaf lettuce and three Roma tomato slices top a ¼ lb. of 100% McDonald’s fresh beef that’s hot, deliciously juicy and cooked when you order. Seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese, creamy mayo, slivered onions and tangy pickles on a soft, fluffy sesame seed hamburger bun.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1005,
                    name = "Futur Numérique",
                    description = " Axée sur les innovations futures dans le domaine numérique, cette fête explore les domaines tels que la réalité augmentée, la cybersécurité, la blockchain, l'analyse des mégadonnées et les interfaces homme-machine avancées.",//"A classic double burger from McDonald’s, the McDouble stacks two 100% pure beef patties seasoned with just a pinch of salt and pepper. It’s topped with tangy pickles, chopped onions, ketchup, mustard and a slice of melty American cheese.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1006,
                    name = "Soirée Réseau Social ",
                    description = " Inspirée par les plateformes de médias sociaux, cette fête encourage l'interaction entre les étudiants en télécommunications en mettant en place des activités de réseautage, des discussions sur l'impact des médias sociaux sur les communications et des jeux interactifs axés sur la connectivité virtuelle.",//"Each Quarter Pounder with Cheese Bacon burger features thick-cut applewood smoked bacon atop a ¼ lb. of 100% fresh McDonald’s beef that’s cooked when you order. It’s a hot, deliciously juicy bacon cheeseburger, seasoned with just a pinch of salt and pepper and sizzled on our flat iron grill. Layered with two slices of melty American cheese, slivered onions and tangy pickles on a soft, fluffy sesame seed hamburger bun.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1007,
                    name = "Fête de la Connectivité ",
                    description = "Célébrant la connectivité dans tous ses aspects, cette fête met en lumière les progrès dans les réseaux de télécommunications, les communications sans fil, la 5G, l'Internet des objets (IoT) et les applications de communication avancées.",//"Our simple, classic cheeseburger begins with a 100% pure beef patty seasoned with just a pinch of salt and pepper. It's topped with a tangy pickle, chopped onions, ketchup, mustard, and a slice of melty American cheese.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1
                ),
                MenuItem(
                    id = 1008,
                    name = "Fête de la Technologie Avancée",
                    description = "Cette fête met en avant les dernières avancées en matière de technologie, avec des démonstrations de gadgets innovants, des expositions sur l'intelligence artificielle, la réalité virtuelle et augmentée, ainsi que des conférences sur les tendances technologiques émergentes.",//"The McDonald’s Double Cheeseburger features two 100% pure beef burger patties seasoned with just a pinch of salt and pepper. It’s topped with tangy pickles, chopped onions, ketchup, mustard and two slices of melty American cheese.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 1

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
                    id = 2002,
                    name = "Course de Voitures Télécommandées Connectées",
                    description = "Les participants construisent et programment des voitures télécommandées équipées de capteurs et de technologies de communication pour participer à des courses sur des pistes spécialement conçues.",//"Our World Famous Fries are made with premium potatoes such as the Russet Burbank and the Shepody. With 0g of trans fat per labeled serving, these epic fries are crispy and golden on the outside and fluffy on the inside.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 2
                ),
                MenuItem(
                    id = 2003,
                    name = " Fitness Connecté",
                    description = "Organisez un défi de fitness où les participants utilisent des dispositifs de suivi d'activité physique et des applications pour mesurer leur performance dans différentes activités telles que la course, le vélo ou la musculation.",//"Our World Famous Fries are made with premium potatoes such as the Russet Burbank and the Shepody. With 0g of trans fat per labeled serving, these epic fries are crispy and golden on the outside and fluffy on the inside.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 2
                ),
                MenuItem(
                    id = 3001,
                    name = "Futurs de la Télécommunication",
                    description = "Cette conférence explore les tendances émergentes et les technologies futures dans le domaine des télécommunications, avec des présentations sur la 6G, l'Internet des objets (IoT), la réalité augmentée (AR) et les réseaux intelligents.",//"Coca-Cola is a refreshing McDonald's soda option that complements all of your menu favorites.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 3002,
                    name = "la Sécurité des Réseaux",
                    description = "Axée sur la cybersécurité et la protection des réseaux, cette conférence présente des experts du domaine qui discutent des défis actuels et des meilleures pratiques pour assurer la sécurité des communications et des données.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 3
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
                    id = 3004,
                    name = "l'Intelligence Artificielle et les Communications",
                    description = "Cette conférence explore le rôle croissant de l'intelligence artificielle (IA) dans les communications, avec des présentations sur les chatbots, la reconnaissance vocale, la traduction automatique et d'autres applications de l'IA dans le domaine des télécommunications",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 3005,
                    name = " Connectivité Mondiale ",
                    description = "Axée sur les enjeux de connectivité à l'échelle mondiale, cette conférence examine les initiatives visant à étendre l'accès à Internet dans les régions mal desservies, les technologies de satellite, les réseaux mesh et d'autres solutions de connectivité mondiale.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 3006,
                    name = "Économie Numérique ",
                    description = "TCette conférence analyse les implications économiques de l'évolution des technologies de communication, avec des présentations sur l'impact sur les entreprises, les industries traditionnelles, le commerce électronique et les modèles d'affaires numériques.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 3007,
                    name = "Télécommunication et le Développement Durable :",
                    description = "SCette conférence examine comment les technologies de communication peuvent contribuer au développement durable, avec des discussions sur l'efficacité énergétique, la réduction de la fracture numérique et l'utilisation de la télécommunication pour résoudre les défis environnementaux.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 3
                ),
                MenuItem(
                    id = 4001,
                    name = "Concours de Projets Technologiques",
                    description = "Les participants sont invités à concevoir et à présenter des projets novateurs dans le domaine des télécommunications, en mettant l'accent sur la créativité, l'originalité et l'applicabilité pratique.",//"The one and only McDonald’s Big Mac Combo Meal. Big Mac Ingredients include a classic sesame hamburger bun, Big Mac Sauce, American cheese and sliced pickles. The Big Mac Combo Meal is served with our World Famous Fries and your choice of an icy Coca-Cola fountain drink.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
                MenuItem(
                    id = 4002,
                    name = "Concours de Programmation de Réseaux ",
                    description = "Les équipes s'affrontent dans des défis de programmation axés sur le développement de solutions logicielles pour améliorer les performances, la sécurité ou la gestion des réseaux de télécommunications.",//"Our Cheeseburger Combo Meal is a simple, satisfying classic McDonald’s 100% beef burger, served with our World Famous Fries and your choice of a Medium McDonald’s soda or soft drink.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 4
                ),
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
                    id = 5001,
                    name = "Sponsor Principal",
                    description = "Devenir le sponsor principal de l'événement, avec une visibilité maximale sur tous les supports promotionnels, y compris le matériel marketing, les médias sociaux, les annonces et les panneaux d'affichage lors de l'événement.",//"A juicy hamburger with kid-sized World Famous Fries and your choice of a Happy Meal side: Apple Slices or Yoplait GO-GURT Low Fat Strawberry Yogurt. Then pick a kids’ drink: 1% Low Fat Milk Jug, DASANI Water or Honest Kids Appley Ever After Organic Juice Drink.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 5
                ),
                MenuItem(
                    id = 5002,
                    name = "Sponsor Technologique",
                    description = "Fournir du matériel technologique de pointe pour l'événement, comme des équipements de télécommunication, des gadgets électroniques ou des solutions logicielles, en échange d'une visibilité sur les supports promotionnels et d'une reconnaissance spéciale lors de l'événement.",//"Grab a McDonald’s Happy Meal and get four tender Chicken McNuggets made with white meat with kid-sized World Famous Fries and a side of Apple Slices. Then pick a kids’ drink: 1% Low Fat Milk Jug, Reduced Sugar Low Fat Chocolate Milk Jug, DASANI Water or Honest Kids Appley Ever After Organic Juice Drink. Plus, a fun toy completes every Happy Meal from McDonald’s.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 5
                ),
                MenuItem(
                    id = 5003,
                    name = "Sponsor Médias et Communication",
                    description = "Fournir un soutien médiatique pour promouvoir l'événement, comme la couverture médiatique, la publicité en ligne, les interviews d'experts et les articles de presse, en échange d'une visibilité sur les supports promotionnels et d'une reconnaissance dans les communiqués de presse.",// "Enjoy a McDonald’s Happy Meal and get six tender Chicken McNuggets made with white meat with kid-sized World Famous Fries and a side of Apple Slices. Then pick a kids’ drink: 1% Low Fat Milk Jug, Reduced Sugar Low Fat Chocolate Milk Jug, DASANI Water or Honest Kids Appley Ever After Organic Juice Drink. Plus, every McDonald’s kids’ meal comes with a McDonald’s Happy Meal toy!",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 5
                ),
                MenuItem(
                    id = 6001,
                    name = "Remise des Prix",
                    description = "Une cérémonie pour honorer les gagnants des concours, des challenges et des compétitions organisés pendant l'événement, avec la remise de trophées, de certificats et de récompenses spéciales aux participants méritants.",//"Enjoy our creamy vanilla soft serve in a crispy cone! It's the perfect sweet treat in addition to any McDonald's meal or on its own!",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 6
                ),
                MenuItem(
                    id = 6002,
                    name = "Cérémonie de Clôture",
                    description = "Une cérémonie finale pour marquer la fin de l'événement, comprenant des discours de clôture, des remerciements aux sponsors, aux conférenciers et aux participants, ainsi qu'une rétrospective des moments forts de l'événement.",//"Our classic hot fudge sundae is made with creamy vanilla soft serve and smothered in chocolaty hot fudge topping.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 6
                ),
                MenuItem(
                    id = 6003,
                    name = "Cérémonie de Gala ",
                    description = "Une cérémonie de gala élégante et sophistiquée pour célébrer la réussite de l'événement, avec un dîner de gala, des divertissements en direct, des discours inspirants et des moments de convivialité entre les participants.",//"The McDonald’s M&M McFlurry is a sweet, creamy M&M’S dessert of vanilla soft serve with M&M’S chocolate candies swirled in.",
                    image = "",
                    price = getRandomPrice(),
                    categoryId = 6
                )


            )
        )
    }

    fun getRandomPrice(): Double = (100000 ..200000).random() + 0.99

}