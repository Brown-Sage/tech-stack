import pygame
import random

# Initialize Pygame
pygame.init()

# Set up the game window
WINDOW_WIDTH = 800
WINDOW_HEIGHT = 600
WINDOW = pygame.display.set_mode((WINDOW_WIDTH, WINDOW_HEIGHT))
pygame.display.set_caption("Snake Game")

# Define colors
BLACK = (0, 0, 0)
GREEN = (0, 255, 0)
RED = (255, 0, 0)
WHITE = (255, 255, 255)
GRAY = (128, 128, 128)

# Set up the snake
SNAKE_SIZE = 10
SNAKE_X = WINDOW_WIDTH // 2
SNAKE_Y = WINDOW_HEIGHT // 2
SNAKE_DX = SNAKE_SIZE  # Initial direction is right
SNAKE_DY = 0
SNAKE_BODY = [[SNAKE_X, SNAKE_Y]]
INITIAL_SNAKE_SPEED = 15

# Set up the food
FOOD_X = random.randrange(SNAKE_SIZE, WINDOW_WIDTH - SNAKE_SIZE, SNAKE_SIZE)
FOOD_Y = random.randrange(SNAKE_SIZE, WINDOW_HEIGHT - SNAKE_SIZE, SNAKE_SIZE)

# Set up the sad snake pixels
SAD_SNAKE_PIXELS = []
SAD_SNAKE_DX = 2
SAD_SNAKE_DY = 1

# Game variables
CLOCK = pygame.time.Clock()
GAME_OVER = False
PAUSE = False
SCORE = 0
SNAKE_SPEED = INITIAL_SNAKE_SPEED
MAX_SNAKE_SPEED = 30

# Game loop
while True:
    # Handle events
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            quit()

    # Move the snake only if the game is not paused
    if not PAUSE:
        SNAKE_X += SNAKE_DX
        SNAKE_Y += SNAKE_DY

        # Wrap the snake around the edges of the screen
        SNAKE_X %= WINDOW_WIDTH
        SNAKE_Y %= WINDOW_HEIGHT

        # Check for collisions with the snake body
        if [SNAKE_X, SNAKE_Y] in SNAKE_BODY[:-1]:
            GAME_OVER = True
            PAUSE = True

        # Add the new head position to the snake body
        SNAKE_BODY.append([SNAKE_X, SNAKE_Y])

        # Check if the snake ate the food
        if SNAKE_X == FOOD_X and SNAKE_Y == FOOD_Y:
            FOOD_X = random.randrange(SNAKE_SIZE, WINDOW_WIDTH - SNAKE_SIZE, SNAKE_SIZE)
            FOOD_Y = random.randrange(SNAKE_SIZE, WINDOW_HEIGHT - SNAKE_SIZE, SNAKE_SIZE)
            SCORE += 1
            SNAKE_SPEED = min(SNAKE_SPEED + 1, MAX_SNAKE_SPEED)  # Increase snake speed up to MAX_SNAKE_SPEED
        else:
            SNAKE_BODY.pop(0)

        # Automatically change direction towards the food
        dx = FOOD_X - SNAKE_X
        dy = FOOD_Y - SNAKE_Y
        if dx > 0:
            SNAKE_DX = SNAKE_SIZE
            SNAKE_DY = 0
        elif dx < 0:
            SNAKE_DX = -SNAKE_SIZE
            SNAKE_DY = 0
        elif dy > 0:
            SNAKE_DX = 0
            SNAKE_DY = SNAKE_SIZE
        else:
            SNAKE_DX = 0
            SNAKE_DY = -SNAKE_SIZE

    # Move the sad snake pixels
    if GAME_OVER:
        SAD_SNAKE_PIXELS = [(x + SAD_SNAKE_DX, y + SAD_SNAKE_DY) for x, y in SNAKE_BODY]

        SAD_SNAKE_DX = -SAD_SNAKE_DX if any(x < 0 or x >= WINDOW_WIDTH for x, y in SAD_SNAKE_PIXELS) else SAD_SNAKE_DX
        SAD_SNAKE_DY = -SAD_SNAKE_DY if any(y < 0 or y >= WINDOW_HEIGHT for x, y in SAD_SNAKE_PIXELS) else SAD_SNAKE_DY

    # Clear the window
    WINDOW.fill(BLACK)

    # Draw the snake
    [pygame.draw.rect(WINDOW, GREEN, (x, y, SNAKE_SIZE, SNAKE_SIZE)) for x, y in SNAKE_BODY]

    # Draw the food
    pygame.draw.rect(WINDOW, RED, (FOOD_X, FOOD_Y, SNAKE_SIZE, SNAKE_SIZE))

    # Draw the "Game Over" message, score, and sad snake pixels if the game is over
    if GAME_OVER:
        GAME_OVER_FONT = pygame.font.Font(None, 48)
        GAME_OVER_TEXT = GAME_OVER_FONT.render("Game Over", True, WHITE)
        TEXT_RECT = GAME_OVER_TEXT.get_rect()
        TEXT_RECT.center = (WINDOW_WIDTH // 2, WINDOW_HEIGHT // 2 - 75)
        WINDOW.blit(GAME_OVER_TEXT, TEXT_RECT)

        SCORE_TEXT = GAME_OVER_FONT.render(f"Score: {SCORE}", True, WHITE)
        SCORE_RECT = SCORE_TEXT.get_rect()
        SCORE_RECT.center = (WINDOW_WIDTH // 2, WINDOW_HEIGHT // 2)
        WINDOW.blit(SCORE_TEXT, SCORE_RECT)

        # Draw the sad snake pixels
        [pygame.draw.rect(WINDOW, GRAY, (x, y, SNAKE_SIZE // 2, SNAKE_SIZE // 2)) for x, y in SAD_SNAKE_PIXELS]

    # Update the display
    pygame.display.update()

    # Set the frame rate
    CLOCK.tick(SNAKE_SPEED)