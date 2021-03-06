/*
 * Copyright 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.levien.synthesizer.core.music;

/**
 * Listener for events from a ScorePlayer.
 * @see ScorePlayer
 */
public interface ScorePlayerListener {
  /**
   * Called when playback starts.
   */
  void onStart();

  /**
   * Called every so often during playback.
   * @param time - time in measures from the start of the score.
   */
  void onTimeUpdate(double time);

  /**
   * Called when playback stops.
   */
  void onStop();
}
