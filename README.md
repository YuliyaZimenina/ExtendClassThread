# ExtendClassThread

**Education project on multithreading in Java**

## Table of contents
1. [Description](#description)
2. [Technologies](#technologies).
3. [Installation and Launch](#installation-and-launch)
4. [Author](#author)
5. [License](#license)
6. [Usage Examples](#usage-examples)

## Description
This project demonstrates creating and starting a thread using the `Thread` class extension.
The project shows how to create and run a thread in Java by extending the `Thread` class. It helps understand the basics of multithreading in Java.

### Concepts:
- Creation and management of threads(Threads)

## Technologies

- **Java 17**
- **Threads** (Threads)

## Installation and launch

1. Clone the repository:
    ```bash
    git clone https://github.com/YuliyaZimenina/ExtendClassThread.git
    cd ExtendClassThread
    ```
    
2. Open the project in your IDE (e.g. IntelliJ IDEA, Eclipse).

3. Run the main class(for example, "Main.java").

## Author 

[Yuliya Zimenina](https://github.com/YuliyaZimenina)


## License

This project is distributed under the MIT license. 
For more details see the file [LICENSE](LICENSE).

## Usage Examples

Code examples showing the use of multithreading in a project:

````java
public class ExtendThread {
    public static void main(String[] args) {
        MyThread myThread = MyThread.createAndStart("Child #1");
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch (InterruptedException exception){
                System.out.println("Main thread is interrupted");
            }
        }
        System.out.println("Main thread is finished");
    }
}

 
