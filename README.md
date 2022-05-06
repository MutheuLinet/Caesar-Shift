# Caesar Shift

## Author

Linet Mutheu

### Description

This is an application where users may input text and a private key that is used to encrypt their message. The idea used is a Caesar shift. This is a type of substitution in which each letter is shifted a certain number of places also known as a key, down the alphabet. For example, with a shift of 1, A would be replaced by B, B would become C, and so on.
Users can choose between encrypting and decrypting, enter their message and private key, see the encrypted message and further decrypt the message.

### Setup and Installation

To access this project on your local files, you can clone it using these steps

1. Open your terminal
2. Use this command to clone `$ git clone
   https://github.com/MutheuLinet/Caesar-Shift.git
3. This will clone the repository into your local folder
4. Navigate to the folder you cloned into, within src/main/java/App.java and open it with intellij.
5. Run App.java on your terminal.

### Behavior Driven Development
The user is able to;

1. Run the application using their terminal

2. Input the Characters to encode or decode ie THE QUICK BROWN LAZY FOX

3. Key in the key ie 3

4. Read the output Provided.

(It also allows a user to Test the output before actual running of the App)


### Running Tests
1. Navigate to the folder you cloned into, within src/test/java/shiftTests and open it with intellij. Select the DecodeTests or ExpressInCodeTests.
2. This is a sample test to shift characters 23 steps forward from their original positions.
   
@Test
   public void Decode_decodesText_String() throws Exception {

Decode decode = new Decode();

   String inputted = decode.undoCode("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23);
   
assertEquals ("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", inputted);
   
}
4. Right click within the open test file and run the tests on your terminal.

### Technologies Used

1. Java
2. IntelliJ
3. Junit
4. Jdk
5. SDK

### License

This project is under the [MIT](LICENSE) licence

### Copyright

Copyright (c) 2022 Linet Mutheu
