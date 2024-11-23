![image](https://github.com/user-attachments/assets/09b0624d-05e7-4084-90f0-7b630eb4f6b7)
**ER Diagram**__

User
**Attributes:** UserID, Name, Email, Password, LoginMethod
**Relationships:**
Has a Profile (1-to-1)
Creates multiple Playlists (1-to-many)
Has Meditation Progress (1-to-1)

Profile
**Attributes:** ProfileID, UserID, MeditationStreaks, TotalTimeSpent, Preferences, Reminders
**Relationships:**
Belongs to a User (1-to-1)

MeditationCategory
**Attributes:** CategoryID, CategoryName, Description
**Relationships:**
Contains multiple MeditationSessions (1-to-many)

MeditationSession
**Attributes:** SessionID, CategoryID, SessionName, Duration, AudioFile, ImageFile
**Relationships:**
Belongs to a MeditationCategory (many-to-1)

MusicTrack
**Attributes**: TrackID, TrackName, TrackType, AudioFile
**Relationships:**
Can be added to multiple Playlists (many-to-many)

Playlist
**Attributes:** PlaylistID, UserID, PlaylistName
**Relationships:**
Created by a User (many-to-1)
Contains multiple MusicTracks (many-to-many)

MeditationProgress
**Attributes:** ProgressID, UserID, SessionID, CompletionDate, Duration
**Relationships:**
Belongs to a User (many-to-1)
Relates to a MeditationSession (many-to-1)


**Relationships Summary:**
User has a Profile (1-to-1).
User has Meditation Progress records for completed sessions (1-to-many).
User creates Playlists (1-to-many).
Playlist contains MusicTracks (many-to-many).
MeditationCategory includes multiple MeditationSessions (1-to-many).

### Calmsphere
CalmSphere is a platform designed to support users in managing stress and improving mental well-being through a tailored experience that includes meditation, soothing music, and mindfulness practices. The app focuses on helping users seamlessly incorporate mindfulness into their daily lives, promoting relaxation, enhanced focus, and reduced stress.

## Team Members:**
Pooja Palle\
Sushma Vadlamudi\
Kotesh Rekha\
Sridhar Cheppala

## Features:**
**User Authentication**
•	Registration:\
o	New users can register by providing their name, email, username, and password.\
o	Input validation to ensure all fields are filled correctly.\
•	Login:\
o	Users can log in using their username and password.\
o	Error messages for invalid credentials.\
•	Logout:\
o	Users can securely log out of the application.\
**Main Dashboard (Home Screen)**
•	Displays a welcome message with the user’s name.\
•	Provides access to key features:\
o	Guided Meditation\
o	Soothing Sounds\
o	Personalized Music Recommendations\
**Meditation Categories**
•	Users can choose from different meditation categories.\
**Music Player**
•	A dedicated screen for playing soothing or spiritual music.\
•	Includes standard controls:\
o	Play/Pause button.\
o	Forward/Backward navigation within a track.\
**Profile Management**
•	Edit Profile:\
o	Users can view and update their details.\

## Test Credentials:
•  Username: testuser1\
•  Password: password12345

## Sequence information:
•  Login Page\
↳ Success: Navigate to Main Dashboard\
↳ Registration: Navigate to Register Page\
•  Register Page\
↳ Success: Navigate back to Login Page\
•  Main Dashboard\
↳ Guided Meditation: Navigate to Meditation Activity\
↳ Soothing Sounds: Navigate to Music Activity\
↳ Edit Profile: Navigate to Profile Activity\
•  Meditation Activity\
↳ Select a track: Navigate to Music Activity\
•  Music Activity\
↳ Return to Main Dashboard\
•  Edit Profile\
↳ Logout: Navigate to Login Page






