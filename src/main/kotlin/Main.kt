fun main(){
    password("Reds576hkj")
    randonString("Shalom")
    multiple()
    var account = CurrentAccount(10000233,"Rediet Zeray",31000000.00)
    println(account.deposit(2000.00))
    println(account.withdraw(2000.0))
    account.details()
    var saving = SavingAccount(100004445,"Rediet Zeray",120000.0,3)
    println(saving.withdraw(1200.0))


}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
data class Random(var first:Char, var last:Char, var length:Int, var begin:Boolean)
fun randonString(name:String){
 var name = "Rediet"
    var first = name[0]
    var length = name.length
    var vowel =
}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
fun password(pass:String):String{

if(8<=pass.length<=16&&pass!="password"&&pass.contains(Int)){
return "valid"
}
    else{
        return "invalid"
    }

}


////Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiple(){
    var multi = 1..1000
    for(m in multi){
        if(m%6==0&&m%8==0){
            println("Bingo")
        }
        else if(m%6==0){
            println(m)
        }
        else if(m%8==0){
            println(m)
        }

    }
}


//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
open class CurrentAccount(var accountNumber:Int, var accountName:String, var balance:Double){
    fun deposit(amount:Double){
        var amount= balance
        amount+=balance

    }
   open fun withdraw(amount:Double){
        var amount = balance
        balance-=amount
    }
    fun details(){
        println("Account number $accountNumber with balance$balance is operatede by $accountName")
    }
}

//5. Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingAccount(accountNumber:Int, accountName:String, balance:Double, var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance) {

    override fun withdraw(amount: Double) {
        var amount = balance
        if (withdrawals < 4) {
            balance -= amount
        }
        withdrawals++
    }

}










