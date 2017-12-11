package org.frice.utils.media

import org.frice.GameFX
import org.frice.event.MOUSE_CLICKED
import org.frice.event.OnMouseEvent
import org.frice.utils.message.FLog

class AudioPlayerTest : GameFX() {
	val player = getPlayer("../TouhouFrice/res/bgm.mp3", true)
	override fun onLastInit() {
		player.start()
	}

	override fun onMouse(e: OnMouseEvent) {
		if (e.type == MOUSE_CLICKED) player.stopPlaying()
		FLog.d(player.state)
	}

	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			launch(AudioPlayerTest::class.java)
		}
	}
}
