class BankAccount:
    def __init__(self, account_number, balance=0):
        self.account_number = account_number
        self.balance = balance
    
    def deposit(self, amount):
        self.balance += amount
    
    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient funds")
    
    def display(self):
        print(f"Account Number: {self.account_number}")
        print(f"Balance: ${self.balance}")


account1 = BankAccount("1234567890", 1000)
account2 = BankAccount("0987654321", 500)

account1.display()
account2.display()

account1.deposit(500)
account2.withdraw(200)

account1.display()
account2.display()
