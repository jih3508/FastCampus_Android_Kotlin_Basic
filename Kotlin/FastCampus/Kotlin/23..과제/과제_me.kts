/*
1. Warrior, Knight, Monster는 체력, 공격력, 방어력이 존재하며 생존 여부를 알 수 있어야 한다.
2. Knight는  hardAttack 기능이 있고, 이 기능을 사용하기 위해서 energy지가 3 필요하다.
3. Warrior는 monster를 특정 마리수 이상 처치하며 Knight로 레벨 업이 가능 함.
*/

open class Warrior(HP: Int, var AD: Int, var DP : Int){

    open var HP: Int = 0
    set(value) {
        field = value
        println("아직 Warrior가 살아 있습니다. 체력: ${this.HP}")
    }

    init {
        this.HP = HP
    }

    var EX : Int = 10
    var Life: Boolean = true



    fun attack(): Int{
        println("Warrior가 기본 공격")
        return AD
    }

}
class Knight(HP: Int, AD: Int, DP : Int, var MP: Int = 100): Warrior (HP, AD, DP){

    override var HP: Int = 0
    set(value) {
        field = value
        println("아직 Knight가 살아 있습니다. 체력: ${this.HP}")

    }

    init {
        this.HP = HP
    }

    fun hardAttack(): Int{
        if(MP > 0){
            println("Knite가 hardAttack 합니다.")
            this.MP -= 3
        }else{
            println("마나가 모자랍니다.")
            return 0
        }

        return AD * 3
    }
}

class Monster(HP : Int, var AD: Int, var DP : Int){

    var Life: Boolean = true
    var HP: Int = 0
    set(value) {

       field = value
       println("아직 Monster가 살아 있습니다. 체력: ${this.HP}")
    }
    init {
        this.HP = HP
    }

    fun attack(): Int {
        println("Monster가 기본 공격")
        return AD
    }

    fun copy(): Monster{
        return Monster(HP, AD, DP)
    }


}


var warrior: Warrior = Warrior(100, 50, 10)

var goblin: Monster = Monster(10, 10, 2)

var golam: Monster = Monster(50, 20, 30)


var monsters : List<Monster> = listOf<Monster>(goblin, golam)

var i : Int = 0

while(warrior.EX > 0){

    var baseMonster : Monster = monsters.get(i)
    var monster: Monster = baseMonster.copy()
    var Heal : Int = monster.HP

    while(monster.Life || warrior.Life){

        monster.HP = monster.HP - warrior.attack() + monster.DP
        if(monster.HP <= 0){
            println("몬스터 처리 했습니다.")
            monster.Life = false
            warrior.EX -= 1
            break
        }
        warrior.HP -= warrior.HP - monster.attack() + warrior.DP
        if(warrior.HP <= 0){
            warrior.Life = false
            println("Warrior가 죽었습니다.")
            break
        }
    }

    if(warrior.Life == true){
        warrior.HP = Heal + warrior.HP
        warrior.AD += monster.AD
    }

    i = (i + 1) % 2
}

println("Knight로 승급 했습니다.")
warrior = Knight(warrior.HP + 200, warrior.AD * 2, warrior.DP *2)