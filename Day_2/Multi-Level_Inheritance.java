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

class FixedDepositAccount(SavingsAccount):
    def __init__(self, balance=0, interest_rate=0.05, term=12):
        super().__init__(balance, interest_rate)
        self.term = term
    
    def withdraw(self, amount):
        print("Cannot withdraw from Fixed Deposit Account before term end")

# Usage
fd = FixedDepositAccount(10000, 0.06, 24)
fd.display()
fd.add_interest()
fd.display()
fd.withdraw(1000)
