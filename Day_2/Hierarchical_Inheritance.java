class BankAccount:
    def __init__(self, balance=0):
        self.balance = balance
    
    def deposit(self, amount):
        self.balance += amount
    
    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Insufficient funds")
    
    def display(self):
        print(f"Balance: ${self.balance}")

class SavingsAccount(BankAccount):
    def __init__(self, balance=0, interest_rate=0.02):
        super().__init__(balance)
        self.interest_rate = interest_rate
    
    def add_interest(self):
        interest = self.balance * self.interest_rate
        self.deposit(interest)

class CheckingAccount(BankAccount):
    def __init__(self, balance=0, overdraft_limit=100):
        super().__init__(balance)
        self.overdraft_limit = overdraft_limit
    
    def withdraw(self, amount):
        if self.balance + self.overdraft_limit >= amount:
            self.balance -= amount
        else:
            print("Exceeds overdraft limit")


savings = SavingsAccount(1000, 0.03)
checking = CheckingAccount(500, 200)
savings.display()
checking.display()
savings.add_interest()
checking.withdraw(600)
savings.display()
checking.display()
