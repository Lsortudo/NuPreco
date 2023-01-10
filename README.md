# Food app

This challenge resumes on: An idea to not only **help normal people, but also people who work with food** (either through an app like Ifood, Uber Eats or selling at their door).
It consists of an application for you to track how many portions will be the total, how much is the total value and per slice/unit along with goals to be achieved and last but not least: where you can save your recipes with all the details; from expense, income, ingredients, etc...

## Technologies i've used

 - **MVVM** - Architecture choosed;
 - **Coroutines** - Asynchronous programming;
 - **RecyclerView** - To list data;
 - **ViewBinding** - To change UI data with less pollution in activity;
 - **LifeCycle** - Android lifecycle to avoid errors/crashs;
 - **ROOM** - To save data on local DB;

# Current state

#### That's the current state of the app, I'll try my best to keep the app true to the design and utilize all technologies i've previously listed.

### Checkboxes

 - [x] Project idea;
 - [x] Design;
 - [x] Readme;
 - [x]  Project setup;
 - [x]  Gradle updated;
 - [x]  Architeture;
 - [x]  ROOM Configuration;
 - [ ]  Main screen;
 - [x]  BottomTabNavigation;
 - [x]  Ingredients screen;
 - [ ]  Calculations screen;
 - [ ]  Recipes screen;
 - [ ]  Details_Ingredients screen;
 - [ ]  Details_Recipes screen;
 - [ ]  Ingredients screen redesign with ROOM data;
 - [ ]  Recipes screen redesign with ROOM data;
 - [ ]  Edit, Delete and Share button enabled {**not listed as required, it's a plus**};
 - [x]  Have the project available on Github;
 - [ ]  Configuration screen {**not listed as required, it's a plus**};
 - [ ]  Publish the app on Play Store {**not listed as required, it's a plus**};
 - [ ]  Loading animation{**not listed as required, it's a plus**};

## Updates with dates
> **Note:** The dates may be a little off due to forgetting to update them in real time;

**2022** - 	*Project idea** <br>
**2022** - *Project design* <br>
**23/03/2022** - *README creation* <br>
**05/01/2023** - *Project started* | *Project setup* | *Architecture* <br>
**06/01/2023** - *Gradle updated* | *ROOM configuration* <br>
**07/01/2023** - *Basic viewmodel implementation* <br>
**08/01/2023** - *List item recyclerview design* <br>
**09/01/2023** - *Ingredient screen* <br>
**10/01/2023** - *To be defined* <br>
**11/01/2023** - *To be defined* <br>


## Language

Which language and why did I choose?

|                |Kotlin                          |JAVA                         |
|----------------|-------------------------------|-----------------------------|
|Code			 	  |**It's not that complex**     |*A more complex and larger syntax*|            
|Popularity     	  |**It's gaining popularity after Kotlin first**            |*More popular making it easy to find guides about bugs and doubts*         |
|Community       	  |**Small community, but it's not impossible to find people**|*Huge community which makes it possible to make connections quickly* |
|NullPointerException |**The code won't work if you set it to null unless you do certain things...**|*Well well well* |

# APP Screenshot/Videos

![Main screen](https://github.com/Lsortudo/NuPreco/blob/main/screenshots/MainScreen.png) <br>
![Ingredient Screen](https://github.com/Lsortudo/NuPreco/blob/main/screenshots/IngredientScreen.png)
![Creating Ingredient Screen](https://github.com/Lsortudo/NuPreco/blob/main/screenshots/detailsIngredientScreen.png) <br>
![Recipe Screen](https://github.com/Lsortudo/NuPreco/blob/main/screenshots/RecipeScreen.png)
![Creating Recipe Screen](https://github.com/Lsortudo/NuPreco/blob/main/screenshots/detailsRecipeScreen.png) <br>
![Fixed Costs Screen](https://github.com/Lsortudo/NuPreco/blob/main/screenshots/CalculationScreen.png) <br>
![Filled Creating Recipe Screen](https://github.com/Lsortudo/NuPreco/blob/main/screenshots/filledRecipeScreen.png)
![Filled Fixed Costs Screen](https://github.com/Lsortudo/NuPreco/blob/main/screenshots/filledCalculationScreen.png)

## Diagram about companies


> Situation of companies today.

```mermaid
graph LR
A[Companie] -- Looking for developer --- B([Experienced programmer])
B --- D[Developer]
A --- C(Inexperienced programmer)
C
C[Inexperienced programmer] -- looking for experience --- D[Developer]
```
