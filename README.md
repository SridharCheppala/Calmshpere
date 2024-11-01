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
