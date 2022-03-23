import requests
import sys 

url = "http://localhost:8080/calculate"

def calculate(num0, num1, operator):
    response = requests.get(url, params={
        'num0': num0,
        'num1': num1,
        'operator': operator
    })
    return response.json()

if __name__ == "__main__":
    if (len(sys.argv) == 4):
        print("num0: ", sys.argv[1])
        print("num1: ", sys.argv[2])
        print("operator: ", sys.argv[3])
        print(calculate( float(sys.argv[1]), float(sys.argv[2]), str(sys.argv[3]) ))

# Example 
# add: python3 CalculatorClient.py 10 10 +
# multiply: python3 CalculatorClient.py 10 10 \*
# pow: python3 CalculatorClient.py 10 10 \*\*
# divide: python3 CalculatorClient.py 10 10 \/