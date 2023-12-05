# Constructor method
class test
    def __init__(self, name, breed):
        self.name = name
        self.breed = breed
        self.tricks = []

    # Method to add a trick
    def add_trick(self, trick):
        self.tricks.append(trick)

    # Method to display information about the dog
    def display_info(self):
        print(f"Name: {self.name}")
        print(f"Breed: {self.breed}")
        if self.tricks:
            print("Tricks:")
            for trick in self.tricks:
                print(f"- {trick}")
        else:
            print("No tricks yet!")

dog1 = Dog("Buddy", "Golden Retriever")
dog2 = Dog("Luna", "German Shepherd")

# Add tricks to the dogs
dog1.add_trick("Sit")
dog1.add_trick("Roll over")
dog2.add_trick("Fetch")

# Display information about the dogs
print("Dog 1:")
dog1.display_info()

print("\nDog 2:")
dog2.display_info()
