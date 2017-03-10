# JavaLyricsManager
A java program that lets user write and save lyrics to songs. Songs can be arranged by artist and album.

Operation
A lyrics application, where a user can store information of artists, albums and tracks with lyrics. Artists are displayed as a list.
The user selects an artist from the list. Artist information is displayed in the top portion of the main window. When the user clicks
the ”open” button a new window opens. The new window displays lyrics of the selected track. Tracks can be changed from a drop-down menu.
The user can edit album information here. They can also change the album artwork by clicking on the image.
From the main window the user can change the artist artwork by clicking on the image. A new window opens that lets the user to draw
a custom painting as the artwork. There is no image of the custom painting tool yet because I haven’t decided what kind of
implementation I want to use, but it’s going to be something simple: choose a background color and paint over it with selected color
using the mouse.

Functionalities of the program are described below in more detail:

Required functions:
1. The user can save and load data. Data is a txt-file that holds the information of artists and lyrics.
2. Edit artist info (name of the artists, album, year, etc.)
3. Change artist and album artwork. Album artwork is an image loaded as a resource. Artist artwork is a custom drawing the user can
  paint themselves.
4. Drag and drop to change the order of artists in the list.
5. Delte an artist from the list.
6. Add and edit lyrics.
7. The user can undo and redo text in lyrics section.
8. All file and edit menu items have keyboard shortcuts.

Additional features:
1. Application supports internalization with english and finnish language.
2. Custom component with custom painting (artist artwork described earlier).

File menu has three items:
1. Open 2. Save 3. Exit

Edit menu has two items:
1. Undo 2. Redo

Some changes were required that differ from the original plan:
1. The user can’t draw an image. Instead an image is loaded from the harddrive and then a custom text can be ”drawn” on top of the image.
2. Undoing and redoing text from the lyrics -section felt arbitrary. Instead I implemented the undo and redo -operations to deleting artists from the list, because it felt like a more necessary function than undoing typing.
3. I changed the overall design of the application somewhat from the prototype, basically for user friendly reasons.

Things I succeeded in:
1. Adding, editing, and saving data to a .dat -file.
2. Loading excisting data from a .dat -file
3. Changing the ”artist” artwork, or the ”main” image via dropdown-menu and using the classloader.
4. Deleting artist information.
5. Undoing and redoing deleted artists from the list.
6. Internalization is implemented for both english and finnish languages.
7. All menu-functions have keyboard shortcuts.

Things I failed in:
1. The image and the text is not saved in the .dat -file. Instead the user has to load the main image everytime. This was a problem that I basically had to ignore because it was messing up the whole save-system for some reason. Had I had more time I maybe could’ve got it to work. Saving the image wasn’t actually required in the plan I made, but alas would’ve been a nice feature.
2. Undo and redo-items are greyed-out at the start, but once they’ve been used and ”unused” a couple of times they could’ve been made grey again. Instead they remain ”enabled” for the rest of the runtime, eventhough the function could not be used.
3. I couldn’t get the drag and drop-function to work. This was a huge unfortune, because it was a planned function and would’ve seemed like a useful operation. Having to be able to move the order of the items in the artist-list proved to be too much work, and I couldn’t find good and simple instructions on how to do it. Since it was one of the required functions I set for the application, I
decided to replace it with an implementation of the drop-down-menu (for manipulation of the
main image) which I hadn’t planned on doing.
4. As I mentioned earlier, I gave up on the user drawing of a new image. Basically I did it for two
reasons: because it felt like too much work and would’ve required more time than I had, but also because drawing a picture in Ms Paint -style didn’t feel importand. Instead I chose to implement the custom graphics drawing with a feature to add text over an image. Not as fancy, but still utilizes the custom graphics -requirement I had set for myself in the original plan.
5. Propably some minor Exceptions that I couldn’t find through testing. I couldn’t get the application to crash in any case, so I guess that’s atleast good.

Things to improve
1. There’s a weird glitch that happens everytime the user copy-pastes text to lyrics, which causes the amount of tracks in the dropdown-list to multiply (for example if there was originally tracks from 1- 6, there are now tracks from 1-6 and then 1-6 again.) Closing the lyrics dialog and opening it up again fixes the problem. Also, I could only make that glitch happen when copy-pasteing text. It doesn’t happen when the user inputs text by taping. I couldn’t find a solution or even a solid reason for that occurence.
2. The main image could be saved and loaded with all the other information.
3. The lyrics-dialog has to be closed from the ”close” button. I’ve unenabled the ”x” in the corner, but it would be nice to get rid of it all together. I tried removing the window decorations but that made
the window undraggable which I didn’t like. The ”close”-button has to be pressed because it triggers certain events, like nulling of the tracks-list. But I guess some kind of a work-around would’ve been wise to implement.
I spent a lot of time with the project. It’s hard to estimate how much, but I would say tens of hours. It’s funny how a basically simple program like this can cause a lot of work and a lot of code. And in the end, the amount of code became a bit hard to manage, especially if I wanted to add new features or prove on the excisting ones, and then get errors and crashes that weren’t originally there. Nevertheless, it was a really fun experience and I liked working on the project.
