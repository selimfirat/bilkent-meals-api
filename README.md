# BilkentMealsAPI
An unoffical meals API for Bilkent University Bilintur Catering Centre. Returns JSON data of current week's meals.<br />
Gets data from: http://kafemud.bilkent.edu.tr/monu_eng.html

[![Heroku Status](https://heroku-badge.herokuapp.com/?app=meals-api&style=flat)](https://meals-api.herokuapp.com/)
[![Build Status](https://api.travis-ci.org/mrsfy/BilkentMealsAPI.svg)](https://travis-ci.org/mrsfy/BilkentMealsAPI)

## Endpoints
##### /
Returns whole week's meals
* https://meals-api.herokuapp.com/

### Example JSON Output
```json
[
    {
        "date": "21.02.2016",
        "lunch": [
            [
                "Düğün Çorba",
                "Düğün soup (Chopped meat and cream)"
            ],
            [
                "Püreli Kebap",
                "Kebab with mashed potatoes"
            ],
            [
                "Vejetaryen Fırın Patates",
                "Baked potatoes (Vegetarian)"
            ],
            [
                "Zeytinyağlı Bezelye",
                "Green peas cooked with olive oil"
            ],
            [
                "Elbasan Tatlısı",
                "Pastry soaked in syrup"
            ]
        ],
        "dinner": [
            [
                "Alaca Çorba",
                "Alaca soup (Wheat, chickpeas)"
            ],
            [
                "Etli Türlü",
                "Vegetable casserole with meat"
            ],
            [
                "Vejetaryen Türlü",
                "Vegetable casserole (Vegetarian)"
            ],
            [
                "Pirinç Pilavı",
                "Rice"
            ],
            [
                "Cacık",
                "Cacık (Grated cucumber with diluted yogurt)"
            ]
        ],
        "alternative": [
            [
                "Terbiyeli Köfte",
                "Meatballs seasoned with plain yogurt, eggs and lemon juice"
            ],
            [
                "Piliç Baget (Bulgur Pilavı)",
                "Chicken baguette served with pounded wheat"
            ],
            [
                "Bulgur Pilavı",
                "Pounded wheat"
            ],
            [
                "Arpa Şehriye Pilavı",
                "Rice with vermicelli"
            ],
            [
                "Mücver (Yoğurt)",
                "Fried vegetable patties (Zucchini, egg, flour) served with plain yogurt"
            ],
            [
                "Karışık Salata",
                "Mixed salad"
            ],
            [
                "Yoğurt",
                "Yogurt"
            ],
            [
                "Sütlaç",
                "Rice pudding"
            ],
            [
                "Sup",
                "Pudding with whipped cream"
            ],
            [
                "Tahinli Tatlı",
                "Pastry soaked in syrup"
            ],
            [
                "Mandalina",
                "Tangerines"
            ]
        ],
        "nutritionFacts": {
            "energyByCal": 1310,
            "carbohydratePercentage": 55,
            "proteinPercentage": 13,
            "fatPercentage": 32
        }
    }
]
```

## Dependencies
- [jsoup](https://github.com/jhy/jsoup) - Java HTML Parser
- [spark](https://github.com/perwendel/spark) - Simple Node.JS like web framework
- [gson](https://github.com/google/gson) - A Java serialization library that can convert Java Objects into JSON and back

### Contributing
Open a pull request following [Aaron's git workflow](https://github.com/asmeurer/git-workflow). Do not hesitate to contact me.


### Contributors
* [Selim Fırat Yılmaz](https://github.com/mrsfy)<br />
Feel free to be here -_-

## License
This repository released under MIT License.

Copyright (c) 2016 Selim Fırat Yılmaz

http://opensource.org/licenses/MIT