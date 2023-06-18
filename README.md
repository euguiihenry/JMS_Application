# JMS_Application:
This application was developed for the Directed Systems Development course. The application uses messaging through Java and Apache ActiveMQ Classic.

## Team Members:

Guilherme Henrique & Karen Moreira.

## APP Util Classes:

1. `Link`: This class handles the connection and related operations for each client that logs into the application.

2. `Consumer`: This class is responsible for retrieving messages from the server and displaying them in the application.

3. `Producer`: This class handles sending messages to the server.

4. `Common`: This class contains various utility methods that don't belong to a specific class.

5. `Main`: This class serves as the entry point for your application and manages the creation of objects and threads.

## APP View Classes:

1. `Error`: This class provides error handling methods for displaying error messages in the application interface.

2. `Login`: This class handles user login functionality, allowing users to log in with a username.

3. `Room`: This class represents the main application view where messages are displayed. It manages the `Consumer` and `Producer` objects to interact with the server.

## Details:

1. The info displayed in here is the same info displayed in `concepts` doc.
2. The code have comments that describe what the methods should handle.