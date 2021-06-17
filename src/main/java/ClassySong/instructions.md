/ day 2
mountMoose.howMany(new ArrayList<String>(Arrays.asList("JoHn", "Luke", "AmAndA"))); => 2
// Luke and Amanda are new, john already listened to it the previous day

Also if the same person listened to it more than once a day it should only count them once.

Example
Song mountMoose = new Song("Mount Moose", "The Snazzy Moose");

// day 1
mountMoose.howMany(new ArrayList<String>(Arrays.asList("John", "joHN", "carl"))); => 2

Good luck!